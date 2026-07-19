package ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherProjectConfig {
    @Bean("hello1")
    String helloWorld() {
        return "Hello World!";
    }

    @Bean
    String helloWorld2() {
        return "Hello World2!";
    }

    @Bean
    Integer luckyNumber() {
        return 1;
    }

}
