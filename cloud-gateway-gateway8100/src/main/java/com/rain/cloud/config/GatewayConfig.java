package com.rain.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * 使用java代码配置Gateway
 *
 * @author RainZero
 * @date 2021/6/19
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRoute(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_baidu",
                predicateSpec -> predicateSpec.path("/guonei")
                        .uri("https://news.baidu.com/guonei"));
        return routes.build();

    }
}
