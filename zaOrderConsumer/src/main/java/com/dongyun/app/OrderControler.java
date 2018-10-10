package com.dongyun.app;

import com.dongyun.app.entity.Order;
import com.dongyun.app.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControler {
    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable("id") String id) {
        return this.orderFeign.findOne(id);
    }

}
