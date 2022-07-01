package top.roud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: OrderApplication
 * @Description:
 * @Author roud
 * @Date 2022/7/1
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApplication  {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
