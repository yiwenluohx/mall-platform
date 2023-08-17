package com.lcchain.mall.order.provider.controller;

import com.lcchain.mall.base.common.vo.MerchantVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: luohx
 * @Description:
 * @Date: 2021/10/15 19:21
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @RequestMapping(value = "/getOrderById", method = RequestMethod.GET)
    public ResponseEntity getOrderById(@RequestParam("id") String id) throws Exception{
        Thread.sleep(10000);
        return new ResponseEntity<>("测试feign-okHttp", HttpStatus.OK);
    }
}
