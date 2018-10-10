package com.dongyun.microservice;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.dongyun.microservice.config.FeignHystrixDisableConfiguration;

/**
 * Created by fqye2 on 2018/9/19.
 */
@FeignClient(name = "ms-provider-user"
//        , configuration = FeignHystrixDisableConfiguration.class)
//        , fallback = UserFeignCliengFallback.class)
        , fallbackFactory = UserFeignClintFallbackFactory.class)
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id);

//    @RequestLine("/user/{id}")
//    public User findById(@Param("id") Long id);
}

//@Component
//class UserFeignCliengFallback implements UserFeignClient {
//    private static Logger LOG = LoggerFactory.getLogger(UserFeignCliengFallback.class);
//    @Override
//    public User findById(Long id) {
//        LOG.info("fallback info ..." + id);
//        return new User();
//    }
//}
@Component
class UserFeignClintFallbackFactory implements FallbackFactory<UserFeignClient> {
    private static Logger LOG = LoggerFactory.getLogger(UserFeignClintFallbackFactory.class);
    @Override
    public UserFeignClient create(Throwable cause) {
        LOG.error("fallback info ", cause);
        return new UserFeignClient() {
            @Override
            public User findById(@PathVariable("id") Long id) {
                return new User();
            }
        };
    }
}
