package sba;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SBAApplication {
    public static void main(String[] args) {
        SpringApplication.run(SBAApplication.class);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> System.out.println("spring-boot-app in multi-sca");
    }
}
