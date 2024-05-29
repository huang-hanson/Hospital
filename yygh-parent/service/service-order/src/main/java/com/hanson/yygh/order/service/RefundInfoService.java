package com.hanson.yygh.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanson.yygh.model.order.PaymentInfo;
import com.hanson.yygh.model.order.RefundInfo;

/**
 * @author hanson
 * @date 2024/5/29 22:47
 */
public interface RefundInfoService extends IService<RefundInfo> {

    /**
     * 保存退款记录
     * @param paymentInfo
     */
    RefundInfo saveRefundInfo(PaymentInfo paymentInfo);

}
