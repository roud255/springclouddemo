package top.roud.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.roud.springcloud.entities.Payment;
import top.roud.springcloud.utils.Result;

/**
 * @ClassName: OrderController
 * @Description:
 * @Author roud
 * @Date 2022/7/1
 * @Version 1.0
 */
@RestController
@RequestMapping("/customer")
public class OrderController {
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/payment/create")
    public Result create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,Result.class);
    }
    @GetMapping("/payment/get/{id}")
    public Result getPayment(@PathVariable Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, Result.class, id);
    }
}
