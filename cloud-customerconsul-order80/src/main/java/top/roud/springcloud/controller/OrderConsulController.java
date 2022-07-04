package top.roud.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderConsulController
 * @Description:
 * @Author roud
 * @Date 2022/7/4
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderConsulController {
    public static final String INVOKE_URL = "http://consul-provider-payment";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }

}
