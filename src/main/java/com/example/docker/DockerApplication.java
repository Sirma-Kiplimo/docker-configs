package com.example.docker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(DemoRepository repository) {
        return args -> {
            repository.save(new DemoEntity("Docker", "test"));
        };
    }

}
