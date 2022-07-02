package top.roud.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.roud.springcloud.entities.Payment;

/**
 * @ClassName: PaymentMapper
 * @Description:
 * @Author roud
 * @Date 2022/6/27
 * @Version 1.0
 */
@Mapper
public interface PaymentMapper {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
