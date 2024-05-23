package com.hanson.yygh.hosp.repository;

import com.hanson.yygh.model.hosp.Hospital;
import com.hanson.yygh.model.hosp.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hanson
 * @date 2024/5/24 1:11
 */
@Repository
public interface ScheduleRepository  extends MongoRepository<Schedule,String> {

    Schedule getScheduleByHoscodeAndHosScheduleId(String hoscode, String hosScheduleId);
}
