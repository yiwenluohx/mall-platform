package com.lcchain.mall.user.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcchain.mall.base.common.entity.mbu.Merchant;
import com.lcchain.mall.base.common.vo.MerchantVO;

/**
 * @Author: luohx
 * @Date: 2020/6/28  15:44
 * @Version: 1.0
 */
public interface IMerchantService extends IService<Merchant> {

    MerchantVO getMerchantById(String id);
}
