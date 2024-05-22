package com.hanson.yygh.hosp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanson
 * @date 2024/5/22 13:11
 */
@Configuration
@MapperScan("com.hanson.yygh.hosp.mapper")
public class HospConfig {

    /*
    * 分页插件
    * */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
