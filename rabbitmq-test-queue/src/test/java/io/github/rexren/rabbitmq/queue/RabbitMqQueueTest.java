package io.github.rexren.rabbitmq.queue;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ComponentScan("io.github.rexren.rabbitmq.queue")
@SpringBootTest(classes = RabbitMqQueueTest.class)
public class RabbitMqQueueTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        for (int i = 0; i < 100; i++) {
            sender.send(String.valueOf(i));
        }
    }
}
