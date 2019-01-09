package io.github.rexren.rabbitmq.queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String o){
        rabbitTemplate.convertAndSend(RabbitConfig.queueName, o);
    }
}
