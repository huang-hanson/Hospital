package com.hanson.yygh.msm.service;

import com.hanson.yygh.vo.msm.MsmVo;

/**
 * @author hanson
 * @date 2024/5/28 15:49
 */

public interface MsmService {

    //发送手机验证码
    boolean send(String phone, String code);

    //mq使用发送短信
    boolean send(MsmVo msmVo);
}
