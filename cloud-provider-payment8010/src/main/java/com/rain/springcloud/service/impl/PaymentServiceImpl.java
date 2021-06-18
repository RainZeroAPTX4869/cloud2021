package com.rain.springcloud.service.impl;

import com.rain.springcloud.entity.CommonResult;
import com.rain.springcloud.entity.Payment;
import com.rain.springcloud.dao.PaymentDao;
import com.rain.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Payment)表服务实现类
 *
 * @author makejava
 * @since 2021-06-16 11:40:02
 */
@Service("paymentService")
@Slf4j
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Value("${server.port}")
    private String port;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CommonResult queryById(Long id) {

        Payment payment = paymentDao.queryById(id);
        log.info("查询结果：" + payment + port);
        return payment == null ? CommonResult.fail() : CommonResult.success(port,payment);

    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Payment> queryAllByLimit(int offset, int limit) {
        return this.paymentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param payment 实例对象
     * @return 实例对象
     */
    @Override
    public CommonResult insert(Payment payment) {
        int insert = paymentDao.insert(payment);
        log.info("插入结果：" + insert);
        return insert > 0 ? CommonResult.success(port,insert) : CommonResult.fail();
    }

    /**
     * 修改数据
     *
     * @param payment 实例对象
     * @return 实例对象
     */
    @Override
    public CommonResult update(Payment payment) {
        this.paymentDao.update(payment);
        return this.queryById(payment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.paymentDao.deleteById(id) > 0;
    }
}