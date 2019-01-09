package io.github.rexren.rabbitmq.queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String text) {
        String context = "# " + new Date() + " [" + text + "]";
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}
