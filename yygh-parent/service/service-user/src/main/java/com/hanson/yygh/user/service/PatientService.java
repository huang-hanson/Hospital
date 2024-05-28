package com.hanson.yygh.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanson.yygh.model.user.Patient;

import java.util.List;

/**
 * @author hanson
 * @date 2024/5/28 12:26
 */
public interface PatientService extends IService<Patient> {
    //获取就诊人列表
    List<Patient> findAllUserId(Long userId);

    //根据id获取就诊人信息
    Patient getPatientId(Long id);
}
