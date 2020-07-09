package com.lcchain.mall.base.common.entity.mbo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lcchain.mall.base.common.entity.BaseEntity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: luohx
 * @Date: 2020/7/3  15:45
 * @Version: 1.0
 */
@Data
@TableName("order_trade")
public class OrderTrade extends BaseEntity implements Serializable {
    /**id*/
    @TableId(type = IdType.ID_WORKER_STR)
    private String id;
    /**应用编号*/
    private String appId;
    /**通道ID*/
    private String channelId;
    /**系统订单号*/
    private String orderNo;
    /**订单类型（0-接口订单；1-二维码订单）*/
    private String orderType;
    /**状态（0-待支付；1-已支付；2-已取消；3-已退款;4-无效;5-待转账（退款））*/
    private String orderStatus;
    /**外部订单号*/
    private String outOrderNo;
    /**应付币种*/
    private String symbolPayable;
    /**应付金额*/
    private java.math.BigDecimal amountPayable;
    /**转出账户*/
    private String fromAccount;
    /**转入账户*/
    private String toAccount;
    /**处理标识（0-取消后支付成功；1-待支付超时关闭）*/
    private String statusProcess;
    /**实付币种*/
    private String symbolActual;
    /**实付金额*/
    private java.math.BigDecimal amountActual;
    /**通道成本*/
    private java.math.BigDecimal channelCost;
    /**收单费率*/
    private java.math.BigDecimal feeRateOrder;
    /**收单费*/
    private java.math.BigDecimal feeOrder;
    /**退款费率*/
    private java.math.BigDecimal feeRateRefund;
    /**退款费*/
    private java.math.BigDecimal feeRefund;
    /**退款金额*/
    private java.math.BigDecimal amountRefund;
    /**结算标识（0-未结算；1-结算中；2-已结算）*/
    private String settleStatus;
    /**交易备注*/
    private String remark;
    /**商品名称*/
    private String goodsName;
    /**商品数量*/
    private String quantity;
    /**超时时间*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date delayTime;
    /**结算时间*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date settleTime;

}
