package com.dongyun.service;

import com.dongyun.service.dao.entity.Order;
import com.dongyun.service.dao.OrderMapper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class OrderControler {
    private static Logger LOG = LoggerFactory.getLogger(OrderControler.class);

    @Resource
    private OrderMapper orderMapper;

    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable("id") String id) {
        LOG.info("getorder " + id);
        if (StringUtils.isEmpty(id)) {
            return null;
        }
        Order order = orderMapper.selectByPrimaryKey(id);
        return order;
    }
}
