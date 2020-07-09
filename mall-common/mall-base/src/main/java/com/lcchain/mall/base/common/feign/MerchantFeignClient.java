package com.lcchain.mall.base.common.feign;

import com.lcchain.mall.base.common.constant.ServiceNameConstants;
import com.lcchain.mall.base.common.feign.fallback.MerchantFeignClientFallbackFactory;
import com.lcchain.mall.base.common.feign.feignRequestConfig.FeignRequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: luohx
 * @Date: 2020/7/3  16:00
 * @Version: 1.0
 */
@FeignClient(name = ServiceNameConstants.USER_SERVICE, configuration = FeignRequestInterceptor.class, fallbackFactory = MerchantFeignClientFallbackFactory.class, decode404 = true)
public interface MerchantFeignClient {

    @RequestMapping(value = "/merchant/getMerchantById", method = RequestMethod.GET)
    ResponseEntity getMerchantById(@RequestParam("id") String id);

}
