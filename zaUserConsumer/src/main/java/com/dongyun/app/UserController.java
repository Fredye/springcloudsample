package com.dongyun.app;

import com.dongyun.app.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fqye2 on 2018/10/8.
 */
@RestController
public class UserController {
    private static Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Value("${user.serviceUrl}")
    private String userService;

//    private static String SERVICE = "http://user-service";

    @GetMapping("/user/{id}")
    @HystrixCommand(
            fallbackMethod = "getUserFallback"
            , commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="1000")
            })
    public User getUser(@PathVariable("id") String id) {
        return restTemplate.getForObject(this.userService + "/user/" + id, User.class);
    }
    public User getUserFallback(String id, Throwable e) {
        LOG.warn("getUser fallback, reason:", e);
        return new User();
    }

    @GetMapping("/balance")
    public String getBalancedInfo() {
        ServiceInstance instance = loadBalancerClient.choose(this.userService);
        if (instance != null) {
            LOG.info("Ribbon info ", instance.getHost(), instance.getScheme());
            return instance.getHost();
        } else {
            return "";
        }

    }
}
