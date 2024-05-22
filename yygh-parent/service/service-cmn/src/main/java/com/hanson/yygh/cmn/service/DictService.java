package com.hanson.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanson.yygh.model.cmn.Dict;
import com.hanson.yygh.model.hosp.HospitalSet;

import java.util.List;

/**
 * @author hanson
 * @date 2024/5/22 13:01
 */
public interface DictService extends IService<Dict> {

    //根据数据id查询子数据列表
    List<Dict> findChildData(Long id);
}
