package com.lcchain.mall.thirdparty.provider.service.impl.trafficService;

import com.lcchain.mall.thirdparty.provider.service.impl.trafficService.concrete.ThirdPartyTraffic;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author luohx
 * @desc
 * @date 2020/07/06
 */
public class TrafficFactory {
    private static Map<Integer, ThirdPartyTraffic> trafficMap = new HashMap();

    public static void put(int trafficType, ThirdPartyTraffic partyTraffic){
        trafficMap.put(trafficType, partyTraffic);
    }

    public static ThirdPartyTraffic getClientPay(int type) {
        ThirdPartyTraffic partyTraffic = trafficMap.get(type);
        return Optional.ofNullable(partyTraffic).orElse(null);
    }
}
