package com.dongyun.app.ribbon;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 为指定服务使用RibbonClient配置
 */
//@Configuration
@RibbonClient(name = "user-service", configuration = RibbonConfiguration.class)
public class UserRibbonConfiguration {
}
//@Configuration
class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
        return new RetryRule();
    }
//    @Bean
//    public IPing ribbonPing() {
//        return new PingUrl();
//    }
}