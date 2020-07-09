package com.lcchain.mall.base.common.feign.fallback;

import com.lcchain.mall.base.common.feign.MerchantFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @Author: luohx
 * @Date: 2020/7/3  16:26
 * @Version: 1.0
 */
@Component
public class MerchantFeignClientFallbackFactory implements FallbackFactory<MerchantFeignClient> {
    @Override
    public MerchantFeignClient create(Throwable throwable) {
        return new MerchantFeignClient() {
            @Override
            public ResponseEntity getMerchantById(String id) {
                return new ResponseEntity("操作成功！", HttpStatus.OK);
            }
        };
    }
}
