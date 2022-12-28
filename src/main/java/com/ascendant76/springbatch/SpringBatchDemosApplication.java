package com.ascendant76.springbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ascendant76.springbatch")
public class SpringBatchDemosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchDemosApplication.class, args);
    }
}
