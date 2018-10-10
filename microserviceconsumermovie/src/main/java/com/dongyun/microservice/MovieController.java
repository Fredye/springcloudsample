package com.dongyun.microservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by fqye2 on 2018/9/19.
 */
@RestController
public class MovieController {
    private static Logger LOG = LoggerFactory.getILoggerFactory().getLogger("MovieController");

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${user.userservice}")
    private String userService;
/* 断路器参数
    execution.isolation.thread.timeoutInMilliseconds|执行超时时间|default:1000
    circuitBreaker.requestVolumeThreshold|触发断路最低请求数|default:20
    circuitBreaker.sleepWindowInMilliseconds|断路器恢复时间|default:5000
    circuitBreaker.errorThresholdPercentage|触发短路错误率,单位%|default:50
    coreSize|线程池核心数|default:10
    maxQueueSize|队列长度|default:-1(SynchronousQueue)
    queueSizeRejectionThreshold|队满拒绝服务阈值|default:5|此值生效优先于队满
    metrics.rollingStats.timeInMilliseconds|窗口维持时间|默认10000
    metrics.rollingPercentile.numBuckets|窗口拆分数|默认10
 */
    @GetMapping("/user/{id}")
    @HystrixCommand(fallbackMethod="findByIdFallback"
        , commandProperties={
             @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "5000")
            ,@HystrixProperty(name="metrics.rollingStats.timeInMilliseconds", value="1000")
          }
        , threadPoolProperties = {
             @HystrixProperty(name="coreSize", value="1")
            ,@HystrixProperty(name="maxQueueSize", value="11")
          }
    )
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject(
                this.userService + "/user/" + id,
                User.class
        );
    }

    @GetMapping("/instance")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("ms-provider-user");
    }

    public User findByIdFallback(Long id, Throwable cause) {
        LOG.info("fallback info ", cause);
        return new User();
    }
}
