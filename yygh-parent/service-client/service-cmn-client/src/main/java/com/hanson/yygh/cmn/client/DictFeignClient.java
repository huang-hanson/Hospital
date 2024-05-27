package com.hanson.yygh.cmn.client;

import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hanson
 * @date 2024/5/24 14:07
 */
@FeignClient("service-cmn")
@Repository
public interface DictFeignClient {

    /**
     * 根据dictcode和value查询
     *
     * @param dictCode
     * @param value
     * @return
     */
    @ApiOperation(value = "根据dictcode和value查询")
    @GetMapping("/admin/cmn/dict/getName/{dictCode}/{value}")
    public String getName(@PathVariable("dictCode") String dictCode, @PathVariable("value") String value);

    /**
     * 根据value查询
     *
     * @param value
     * @return
     */
    @ApiOperation(value = "根据value查询")
    @GetMapping("/admin/cmn/dict/getName/{value}")
    public String getName(@PathVariable("value") String value);

}
