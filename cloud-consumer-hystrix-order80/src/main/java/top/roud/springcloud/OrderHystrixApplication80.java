package top.roud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description : TODO
 * @author: roud
 * @date: 2023/6/16
 * @version:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderHystrixApplication80 {
    public static void main(String[] args){
        SpringApplication.run(OrderHystrixApplication80.class, args);
    }
}
