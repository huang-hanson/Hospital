package com.hanson.yygh.hosp.repository;

import com.hanson.yygh.model.hosp.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hanson
 * @date 2024/5/23 18:31
 */
@Repository
public interface HospitalRepository extends MongoRepository<Hospital,String> {

    //判断是否存在数据
    Hospital getHospitalByHoscode(String hoscode);


    //根据医院名称查询
    List<Hospital> findHospitalByHosnameLike(String hosname);
}
