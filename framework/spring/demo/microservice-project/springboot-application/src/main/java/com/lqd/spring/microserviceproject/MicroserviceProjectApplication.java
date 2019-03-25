package com.lqd.spring.microserviceproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @ClassName MicroserviceProjectApplication
 * @Description TODO
 * @Author lqd
 * @Date 2019/3/25 19:11
 * @Version 1.0
 **/
@SpringBootApplication
public class MicroserviceProjectApplication
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder(MicroserviceProjectApplication.class)
                .properties("server.port=0")
                .run(args);
    }
}