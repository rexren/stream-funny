package io.github.rexren.rabbitmq.direct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DirectExchangeApplication.class)
public class RabbitDirectTest {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Test
    public void hello() throws Exception {
        for (int i = 0; i < 100; i++) {
            LogEntry log = new LogEntry();
            log.setContent(String.valueOf(i));
            if (i % 2 == 0) {
                log.setSeverity("info");
            } else {
                log.setSeverity("debug");
            }
            rabbitTemplate.convertAndSend( log.getSeverity(), log);
        }
    }
}
