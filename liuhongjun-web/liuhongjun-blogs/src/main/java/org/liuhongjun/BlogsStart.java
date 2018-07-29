package org.liuhongjun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableRedisHttpSession
@EnableEurekaClient
@SpringBootApplication
@EnableSwagger2
@MapperScan({"org.liuhongjun.repository"})
public class BlogsStart {
    public static void main(String[] args) {
        SpringApplication.run(BlogsStart.class, args);
    }
}
