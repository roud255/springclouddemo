package top.roud.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.roud.springcloud.service.OrderService;
import top.roud.springcloud.utils.Result;

import javax.annotation.Resource;

/**
 * @description : TODO
 * @author: roud
 * @date: 2023/6/16
 * @version:
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/provider/hystrix/get/{id}")
    public Result getPaymentInfo(@PathVariable(value = "id")Integer id){
        return orderService.getPaymentInfo(id);
    }

    @GetMapping("/provider/hystrix/timeout/{id}")
    public Result getPaymentInfoTimeOut(@PathVariable(value = "id")Integer id){
        return orderService.getPaymentInfoTimeOut(id);
    }
}
