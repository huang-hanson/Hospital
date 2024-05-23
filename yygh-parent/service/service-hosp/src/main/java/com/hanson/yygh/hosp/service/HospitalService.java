package com.hanson.yygh.hosp.service;

import com.hanson.yygh.model.hosp.Hospital;

import java.util.Map;

/**
 * @author hanson
 * @date 2024/5/23 18:32
 */
public interface HospitalService {
    /**
     * 上传医院信息
     * @param paramMap
     */
    void save(Map<String, Object> paramMap);

    /**
     * 查询医院
     * @param hoscode
     * @return
     */
    Hospital getByHoscode(String hoscode);
}
