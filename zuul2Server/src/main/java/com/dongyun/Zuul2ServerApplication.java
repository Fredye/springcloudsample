package com.dongyun;

import com.dongyun.fallback.OrderFallbackProvider;
import com.dongyun.filters.PreRequestLogFilter;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableZuulProxy
@EnableHystrixDashboard
public class Zuul2ServerApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public OrderFallbackProvider orderFallbackProvider() {
		return new OrderFallbackProvider();
	}

	@Bean
	public PreRequestLogFilter preRequestLogFilter() {
		return new PreRequestLogFilter();
	}

	@Bean
	public ServletRegistrationBean getServlet() {
		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
		registrationBean.setLoadOnStartup(1);
		registrationBean.addUrlMappings("/hystrix.stream");
		registrationBean.setName("HystrixMetricsStreamServlet");
		return registrationBean;
	}

	/**
	 * Zuul微服务路由的正则配置
	 * @return
	@Bean
	public PatternServiceRouteMapper patternServiceRouteMapper() {
		// servicePattern, routePattern
		// match: service-v1 -> /v1/service/**
		return new PatternServiceRouteMapper(
				"(?<name>^.+)-(?<version>v.+$)",
				"${version}/${name}");
	}
	 */

	public static void main(String[] args) {
		SpringApplication.run(Zuul2ServerApplication.class, args);
	}
}
