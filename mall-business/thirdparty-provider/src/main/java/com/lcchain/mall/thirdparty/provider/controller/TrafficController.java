package com.lcchain.mall.thirdparty.provider.controller;

import com.lcchain.mall.thirdparty.provider.service.ITrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luohx
 * @desc
 * @date 2020/07/06
 */
@RequestMapping("/traffic")
@RestController
public class TrafficController {

    @Autowired
    private ITrafficService trafficService;

    @RequestMapping(value = "/getMerchantById", method = RequestMethod.GET)
    public ResponseEntity getMerchantById(@RequestParam("id") String id) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
