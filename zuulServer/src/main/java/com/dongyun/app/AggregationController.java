package com.dongyun.app;

import com.dongyun.app.model.User;
import com.dongyun.app.service.AggregationService;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import rx.Observable;
import rx.Observer;

import java.util.HashMap;

/**
 * RxJava mode sample
 */
@RestController
public class AggregationController {
    private final Logger LOG = LoggerFactory.getLogger(AggregationController.class);

    @Autowired
    private AggregationService aggregationService;

    @GetMapping("/aggr/{id}")
    public DeferredResult <HashMap<String, User>> aggregate(@PathVariable Long id) {
        Observable<HashMap<String, User>> result = this.aggregateObservable(id);
        return toDeferredResult(result);
    }

    public Observable<HashMap<String, User>> aggregateObservable(Long id) {
        LOG.info("aggregateObservable ...");
        return Observable.zip(
                this.aggregationService.getUserById(id),
                this.aggregationService.getMovieUserId(id),
                (user, movieUser) -> {
                    HashMap<String, User> map = Maps.newHashMap();
                    map.put("user", (User) user);
                    map.put("movieUser", (User) movieUser);
                    return map;
                }
        );
    }

    public DeferredResult<HashMap<String, User>> toDeferredResult(
            Observable<HashMap<String, User>> details) {
        LOG.info("toDeferredResult ...");
        DeferredResult<HashMap<String, User>> result = new DeferredResult<>();
        details.subscribe(new Observer<HashMap<String, User>>() {
            @Override
            public void onCompleted() {
                LOG.info("completed ...");
            }

            @Override
            public void onError(Throwable throwable) {
                LOG.error("error ...");
            }

            @Override
            public void onNext(HashMap<String, User> map) {
                LOG.info("onNext ...");
                result.setResult(map);
            }
        });
        return result;
    }
}
