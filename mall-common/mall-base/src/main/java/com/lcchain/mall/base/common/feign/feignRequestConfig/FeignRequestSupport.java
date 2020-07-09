package com.lcchain.mall.base.common.feign.feignRequestConfig;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luohx
 * @desc Feign配置注册（全局）
 * @date 2020/07/01
 */
@Configuration
public class FeignRequestSupport {
    /**
     * feign请求拦截器
     *
     * @return
     */
    @Bean
    public RequestInterceptor requestInterceptor() {
        return new FeignRequestInterceptor();
    }
}
