package sca.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient(autoRegister = false)
public class ScaWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScaWebApplication.class);
    }
}
