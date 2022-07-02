package top.roud.springcloud.service.impl;

import org.springframework.stereotype.Service;
import top.roud.springcloud.entities.Payment;
import top.roud.springcloud.mapper.PaymentMapper;
import top.roud.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentServiceImpl
 * @Description:
 * @Author roud
 * @Date 2022/7/1
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;
    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
