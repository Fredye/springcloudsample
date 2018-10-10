package com.dongyun.app.service;

import com.dongyun.app.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;


@Service
public class AggregationService {
    private static final Logger LOG = LoggerFactory.getLogger(AggregationService.class);
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getUserById(Long id) {
        LOG.info("getUserById ...");
        return Observable.unsafeCreate(ob -> {
            User user = restTemplate.getForObject(
                    "http://ms-provider-user/user/{id}", User.class, id);
            ob.onNext(user);
            ob.onCompleted();
        });
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getMovieUserId(Long id) {
        LOG.info("getMovieUserId ...");
        return Observable.unsafeCreate(ob -> {
            User movieUser = restTemplate.getForObject(
                    "http://feign-user/user/{id}", User.class, id);
        });
    }

    public User fallback(Long id) {
        LOG.info("fallback ...");
        return new User();
    }
}
