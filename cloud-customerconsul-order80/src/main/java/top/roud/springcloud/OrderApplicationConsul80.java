package top.roud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderApplicationConsul80
 * @Description:
 * @Author roud
 * @Date 2022/7/4
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplicationConsul80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationConsul80.class, args);
    }
}
