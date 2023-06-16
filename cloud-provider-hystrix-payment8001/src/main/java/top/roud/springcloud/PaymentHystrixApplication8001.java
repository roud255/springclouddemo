package top.roud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description : TODO
 * @author: guangrui_hu
 * @date: 2023/6/16
 * @version:
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication8001.class, args);
    }
}
