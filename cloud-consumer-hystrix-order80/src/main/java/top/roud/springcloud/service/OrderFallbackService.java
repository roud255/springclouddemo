package top.roud.springcloud.service;

import org.springframework.stereotype.Component;
import top.roud.springcloud.utils.Result;

/**
 * @description : TODO
 * @author: roud
 * @date: 2023/6/16
 * @version:
 */
@Component
public class OrderFallbackService implements OrderService{
    @Override
    public Result getPaymentInfo(Integer id) {
        return Result.failure("调用失败，id--"+id+",系统服务降级");
    }

    @Override
    public Result getPaymentInfoTimeOut(Integer id) {
        return Result.failure("调用失败，id--"+id+",系统服务降级");
    }
}
