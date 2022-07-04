package top.roud.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderZkController
 * @Description:
 * @Author roud
 * @Date 2022/7/4
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderZkController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/zk", method = RequestMethod.GET)
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);
        return result;
    }
}
