package com.ts.mall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.server.ServerWebExchange;

/**
 * MallCorsConfiguration
 *
 * @author PengXJ
 **/
@Configuration
public class MallCorsConfiguration {

    @Bean
    public CorsWebFilter CorsWebFilter(){
        UrlBasedCorsConfigurationSource source =new UrlBasedCorsConfigurationSource();
        CorsConfiguration cors =new CorsConfiguration();
        //配置跨域
        //那些头可以跨域
        cors.addAllowedHeader("*");
        //那些请求方式
        cors.addAllowedMethod("*");
        //那个请求来源
        cors.addAllowedOrigin("*");
        //是否携带cookie
        cors.setAllowCredentials(true);

        source.registerCorsConfiguration("/**",cors);

        return new CorsWebFilter(source);
    }
}
