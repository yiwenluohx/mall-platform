package com.lcchain.mall.thirdparty.provider.service.impl.trafficService.concrete;

import com.lcchain.mall.base.common.constant.AllEnum;
import com.lcchain.mall.thirdparty.provider.service.impl.trafficService.TrafficFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author luohx
 * @desc
 * @date 2020/07/06
 */
public class AliTraffic implements ThirdPartyTraffic, InitializingBean {





    @Override
    public void afterPropertiesSet() throws Exception {
        TrafficFactory.put(AllEnum.TrafficType.ALI.code(), this);
    }
}
