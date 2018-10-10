package com.dongyun.app.feign;

import com.dongyun.app.entity.Order;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="order-service"
        , configuration=OrderFeignConfiguration.class
        , fallbackFactory = OrderFeignFallback.class)
public interface OrderFeign {
    @GetMapping("/order/{id}")
    public Order findOne(@PathVariable("id") String id);
}
@Component
class OrderFeignFallback implements FallbackFactory<OrderFeign> {
    private static Logger LOG = LoggerFactory.getLogger(OrderFeignFallback.class);

    @Override
    public OrderFeign create(Throwable e) {
        return new OrderFeign() {
            @Override
            public Order findOne(@PathVariable("id") String id) {
                LOG.info("feign hystrix ...reason:", e);
                return new Order();
            }
        };
    }
}
@Configuration
class OrderFeignConfiguration {
    @Bean
    feign.Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.HEADERS;
    }

    /**
     * 禁用Hystrix
     * @return
     @Bean
     @Scope("prototype")
     public Feign.Builder feignBuilder() {
     return Feign.builder();
     }*/
}