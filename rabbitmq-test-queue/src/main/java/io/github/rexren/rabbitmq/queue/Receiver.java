package io.github.rexren.rabbitmq.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class Receiver {

    static final Logger logger = LoggerFactory.getLogger(Receiver.class);


    @RabbitListener(queues = RabbitConfig.queueName, containerFactory="rabbitListenerContainerFactory")
    public void receiveMessage(@Payload String message) {
        logger.info("Received <" + message + ">");
    }
}
