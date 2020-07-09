package com.lcchain.mall.base.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: luohx
 * @Date: 2020/6/29 13:36
 * @Version: 1.0
 */
@Data
public class MerchantVO {

    private String id;

    private String merchantNo;

    private String merchantName;

    private String createBy;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
