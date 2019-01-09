package io.github.rexren.rabbitmq.queue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RabbitQueueTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        for (int i = 0; i < 100; i++) {
            sender.send(String.valueOf(i));
        }
    }
}
