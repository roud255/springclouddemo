package top.roud.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.roud.springcloud.utils.Result;

/**
 * @description : TODO
 * @author: guangrui_hu
 * @date: 2023/6/16
 * @version:
 */
@RestController
public class PaymentCotroller {
    @Value("${server.port}")
    private String port;
    @GetMapping("/provider/hystrix/get/{id}")
    public Result getPaymentInfo(@PathVariable(value = "id")Integer id) throws InterruptedException {
        Thread.sleep(3000);
        return Result.success(id+",port:"+port);
    }

    @GetMapping("/provider/hystrix/timeout/{id}")
    public Result getPaymentInfoTimeOut(@PathVariable(value = "id")Integer id){
        return Result.success(id+",port:"+port);
    }

}
