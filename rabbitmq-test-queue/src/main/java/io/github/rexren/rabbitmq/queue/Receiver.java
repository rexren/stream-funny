package io.github.rexren.rabbitmq.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "rabbit-mq-tset-queue")
public class Receiver {

    static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void receiveMessage(String message) {
        logger.info("Received <" + message + ">");
    }
}
