package com.lcchain.mall.user.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lcchain.mall.base.common.entity.mbu.Merchant;
import com.lcchain.mall.base.common.vo.MerchantVO;
import com.lcchain.mall.user.provider.config.GitAutoRefreshConfig;
import com.lcchain.mall.user.provider.dao.MerchantMapper;
import com.lcchain.mall.user.provider.service.IMerchantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Author: luohx
 * @Date: 2020/6/28 15:42
 * @Version: 1.0
 */
@Slf4j
@Service
public class MerchantServiceImpl extends ServiceImpl<MerchantMapper, Merchant> implements IMerchantService {

    @Autowired
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    @Autowired
    private MerchantMapper merchantMapper;

    @Override
    public MerchantVO getMerchantById(String id) {
        Merchant merchant = merchantMapper.selectById(id);
        MerchantVO merchantVO = new MerchantVO();
        merchantVO.setId(merchant.getId());
        merchantVO.setMerchantName(merchant.getMerchantName());
        merchantVO.setMerchantNo(merchant.getMerchantNo());
        if (StringUtils.isEmpty(merchant.getCreateBy()) && gitAutoRefreshConfig.getUser() != null) {
            merchantVO.setCreateBy(gitAutoRefreshConfig.getUser().getUsername());
        }
        merchantVO.setCreateTime(merchant.getCreateTime());
        log.info("获取商户信息参数，id=" + id);
        return merchantVO;
    }
}
