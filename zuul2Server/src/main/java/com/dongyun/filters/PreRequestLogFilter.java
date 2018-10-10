package com.dongyun.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * ZuulFilter sample
 *  filterType: pre, route, post, error
 *  filterOrder: int
 *  shouldFilter: boolean, 判断该filter是否应该执行
 *  run: 具体的执行逻辑
 * 案例：安全认证，灰度发布，限流
 */
public class PreRequestLogFilter extends ZuulFilter {
    private static Logger LOG = LoggerFactory.getLogger(PreRequestLogFilter.class);

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        LOG.info(String.format("send %s request to %s",
                request.getMethod(),
                request.getRequestURL().toString()));

        return null;
    }
}
