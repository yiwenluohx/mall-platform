package com.lcchain.mall.user.provider.controller;

import com.lcchain.mall.base.common.vo.MerchantVO;
import com.lcchain.mall.user.provider.service.IMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: luohx
 * @Description: 商户
 * @Date: 2020/6/28 14:03
 */
@RequestMapping("/merchant")
@RestController
public class MerchantController {

    @Autowired
    private IMerchantService merchantService;

    @RequestMapping(value = "/getMerchantById", method = RequestMethod.GET)
    public ResponseEntity getMerchantById(@RequestParam("id") String id) {
        MerchantVO merchantVO = merchantService.getMerchantById(id);
        return new ResponseEntity<>(merchantVO, HttpStatus.OK);
    }

}
