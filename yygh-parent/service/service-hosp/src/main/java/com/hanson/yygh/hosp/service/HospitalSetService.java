package com.hanson.yygh.hosp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanson.yygh.model.hosp.HospitalSet;
import com.hanson.yygh.vo.order.SignInfoVo;

/**
 * @author hanson
 * @date 2024/5/22 13:01
 */
public interface HospitalSetService extends IService<HospitalSet> {

    /**
     * 获取签名key
     * @param hoscode
     * @return
     */
    String getSignKey(String hoscode);
}
