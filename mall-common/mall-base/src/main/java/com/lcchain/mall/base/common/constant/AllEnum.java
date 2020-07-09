package com.lcchain.mall.base.common.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author luohx
 * @desc
 * @date 2020/07/06
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AllEnum {

    /**
     * 改变类型：1->淘宝；2->京东；3->拼多多；4->苏宁；5->唯品会；
     * @author luohx
     */
    public enum TrafficType implements BaseEnum<Integer> {
        /**
         * 淘宝联盟
         */
        ALI(1, "淘宝"),

        /**
         * 京东联盟
         */
        JD(2, "京东"),

        /**
         * 多多客
         */
        PINDD(3, "拼多多"),

        /**
         * 京东联盟
         */
        SN(4, "苏宁"),

        /**
         * 唯品会
         */
        VIP(5, "唯品会");

        private int code;
        private String value;

        TrafficType(int code, String value) {
            this.code = code;
            this.value = value;
        }

        @Override
        public Integer code() {
            return code;
        }

        @Override
        public String desc() {
            return value;
        }
    }

    /**
     * 积分来源
     * @author luohx
     */
    public enum IntegralSource implements BaseEnum<Integer> {

        //下单
        order(1, "order"),

        //注册
        register(3, "register");

        private int code;
        private String value;

        IntegralSource(int code, String value) {
            this.code = code;
            this.value = value;
        }

        @Override
        public Integer code() {
            return code;
        }

        @Override
        public String desc() {
            return value;
        }
    }
}
