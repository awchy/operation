package com.dainel.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description ：description
 * @Author ：wangpengfei
 * @Date ：created in 2020/5/24
 */
@SpringBootApplication
@EnableSwagger2
public class OperationApplication {
    public static void main(String[] args){
        SpringApplication.run(OperationApplication.class);
    }
}
