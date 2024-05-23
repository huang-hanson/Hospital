package com.hanson.yygh.hosp.repository;

import com.hanson.yygh.model.hosp.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hanson
 * @date 2024/5/24 0:34
 */
@Repository
public interface DepartmentRepository extends MongoRepository<Department,String> {
    //上传科室接口
    Department getDepartmentByHoscodeAndDepcode(String hoscode, String depcode);
}
