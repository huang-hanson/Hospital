package com.hanson.yygh.msm.receiver;

import com.rabbitmq.client.Channel;
import com.hanson.common.rabbit.constant.MqConst;
import com.hanson.yygh.msm.service.MsmService;
import com.hanson.yygh.vo.msm.MsmVo;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hanson
 * @date 2024/5/29 15:57
 */
@Component
public class MsmReceiver {

    @Autowired
    private MsmService smsService;

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = MqConst.QUEUE_MSM_ITEM, durable = "true"),
            exchange = @Exchange(value = MqConst.EXCHANGE_DIRECT_MSM),
            key = {MqConst.ROUTING_MSM_ITEM}
    ))
    public void send(MsmVo msmVo, Message message, Channel channel) {
        smsService.send(msmVo);
    }
}
