package com.hanson.yygh.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanson
 * @date 2024/5/28 12:16
 */
@Configuration
@MapperScan("com.hanson.yygh.user.mapper")
public class UserConfig {
}
