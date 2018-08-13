package org.liuhongjun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@EnableEurekaClient
@SpringBootApplication
public class BlogsVueStart {
    public static void main(String[] args) {
        SpringApplication.run(BlogsVueStart.class, args);
    }
}
