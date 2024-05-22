package com.hanson.yygh.cmn.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanson
 * @date 2024/5/22 13:11
 */
@Configuration
@MapperScan("com.hanson.yygh.cmn.mapper")
public class CmnConfig {

    /*
    * 分页插件
    * */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
