package top.roud.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import top.roud.springcloud.entities.Payment;
import top.roud.springcloud.service.impl.PaymentServiceImpl;
import top.roud.springcloud.utils.Result;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentController
 * @Description:
 * @Author roud
 * @Date 2022/7/1
 * @Version 1.0
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private PaymentServiceImpl paymentService;

    @PostMapping("/create")
    public Result create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入操作返回结果:" + result);

        if (result > 0) {
            return Result.success("插入数据库成功!******服务端口:"+serverPort);
        } else {
            return Result.failure("插入数据库失败");
        }
    }

    @GetMapping(value = "/get/{id}")
    public Result getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果:{}", payment);
        if (payment != null) {
            return Result.success("获取数据成功！******服务端口:"+serverPort,payment);
        } else {
            return Result.failure("");
        }
    }
}