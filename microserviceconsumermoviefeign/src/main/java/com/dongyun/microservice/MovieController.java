package com.dongyun.microservice;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import feign.Feign;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.openfeign.encoding.BaseRequestInterceptor;
import org.springframework.cloud.openfeign.encoding.FeignClientEncodingProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by fqye2 on 2018/9/19.
 */
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
//    @HystrixCommand(fallbackMethod="findByIdFallback")
    public User findById(@PathVariable Long id) {
//        this.userFeignClient = Feign.builder().requestInterceptor(
//            new BaseRequestInterceptor(FeignClientEncodingProperties p) {
//                @Override
//                public void apply(RequestTemplate requestTemplate) {
//                }
//            }).target(UserFeignClient.class, "http://ms-provider-user/user/");
        return this.userFeignClient.findById(id);
    }

    public User findByIdFallback(Long id, Throwable throwable) {
//        logger
        return null;
    }

}
