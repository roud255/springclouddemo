package top.roud.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.roud.springcloud.utils.Result;

/**
 * @description : TODO
 * @author: roud
 * @date: 2023/6/16
 * @version:
 */
@Component
//服务名大小写自动转换
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = OrderFallbackService.class)
public interface OrderService {
    @GetMapping("/provider/hystrix/get/{id}")
    public Result getPaymentInfo(@PathVariable(value = "id")Integer id);

    @GetMapping("/provider/hystrix/timeout/{id}")
    public Result getPaymentInfoTimeOut(@PathVariable(value = "id")Integer id);
}
