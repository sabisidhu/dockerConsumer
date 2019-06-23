package sample.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import sample.consumer.config.KafkaConsumerProperties;

@SpringBootApplication
@EnableConfigurationProperties(KafkaConsumerProperties.class)
public class MainApp implements CommandLineRunner{

    public static void main(String[] args){

        SpringApplication.run(MainApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
