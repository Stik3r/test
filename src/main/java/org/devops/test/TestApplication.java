package org.devops.test;

import org.devops.test.repository.SaveTimeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestApplication {

    public static void main(String[] args) {
        var config = SpringApplication.run(TestApplication.class, args);
        var repository = config.getBean(SaveTimeRepository.class);
        repository.deleteAll();
    }

}