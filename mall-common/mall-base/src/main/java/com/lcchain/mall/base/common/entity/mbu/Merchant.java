package com.lcchain.mall.base.common.entity.mbu;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lcchain.mall.base.common.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: luohx
 * @Date: 2020/6/29  12:05
 * @Version: 1.0
 */
@Data
@TableName("merchant")
public class Merchant extends BaseEntity implements Serializable {
    /**主键*/
    @TableId(type = IdType.INPUT)
    private String id;
    /**商户编号*/
    private String merchantNo;
    /**商户简称*/
    private String merchantShort;
    /**商户全称*/
    private String merchantName;
    /**信用编码*/
    private String licenseNo;
    /**证件附件*/
    private String licenseUrl;
    /**公司电话*/
    private String tel;
    /**办公地址*/
    private String address;
    /**法人姓名*/
    private String legalName;
    /**法人证件类型*/
    private String legalCardType;
    /**法人证件号*/
    private String legalCardNo;
    /**法人手机号*/
    private String legalMobile;
    /**法人身份证*/
    private String legalUrl;
    /**状态*/
    private String status;
}
