package com.hanson.yygh.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hanson.yygh.model.order.OrderInfo;
import com.hanson.yygh.vo.order.OrderCountQueryVo;
import com.hanson.yygh.vo.order.OrderCountVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hanson
 * @date 2024/5/29 13:46
 */
public interface OrderMapper extends BaseMapper<OrderInfo> {

    //查询预约统计数据的方法
    List<OrderCountVo> selectOrderCount(@Param("vo") OrderCountQueryVo orderCountQueryVo);
}
