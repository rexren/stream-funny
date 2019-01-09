package io.github.rexren.rabbitmq.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmqpConfiguration {

    static final String queueName = "rabbit-mq-tset-queue";

    @Bean
    public Queue queue() {
        return new Queue(queueName, false);
    }
}
