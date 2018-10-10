package com.dongyun.fallback;

import com.netflix.hystrix.exception.HystrixTimeoutException;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class OrderFallbackProvider implements FallbackProvider {
    @Override
    public String getRoute() {
        //适用于所有服务的断路器，"*", or 可以指定具体的服务ID
        return "order-client";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String s, Throwable throwable) {
        if (throwable instanceof HystrixTimeoutException) {
            return this.response(HttpStatus.GATEWAY_TIMEOUT);
        } else {
            return this.fallbackResponse();

        }
    }

    public ClientHttpResponse fallbackResponse() {
        return this.response(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ClientHttpResponse response(HttpStatus status) {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return status;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return status.value();
            }

            @Override
            public String getStatusText() throws IOException {
                return status.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("服务不可用".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                MediaType mt = new MediaType("application", "json", Charset.forName("UTF-8"));
                headers.setContentType(mt);
                return headers;
            }
        };
    }

}
