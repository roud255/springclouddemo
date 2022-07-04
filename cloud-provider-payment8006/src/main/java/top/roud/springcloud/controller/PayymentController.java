package top.roud.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName: PayymentController
 * @Description:
 * @Author roud
 * @Date 2022/7/4
 * @Version 1.0
 */
@RestController
@RequestMapping("/payment")
public class PayymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/consul")
    public String paymentInfo(){
        return "SpringCloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
