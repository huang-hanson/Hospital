package com.hanson.yygh.order.service;

import java.util.Map;

/**
 * @author hanson
 * @date 2024/5/29 22:41
 */
public interface WeixinService {
    //生成微信支付二维码
    Map createNative(Long orderId);

    //调用微信接口实现支付状态查询
    Map<String, String> queryPayStatus(Long orderId);

    /***
     * 退款
     */
    Boolean refund(Long orderId);
}
