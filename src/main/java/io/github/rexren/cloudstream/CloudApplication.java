package io.github.rexren.cloudstream;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class CloudApplication {

    Logger logger = LoggerFactory.getLogger(CloudApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void receive(String payload) {
        logger.info("Received: " + payload);
    }

}
