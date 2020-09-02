package com.eiletxie.springcloud.service.impl;

import com.eiletxie.springcloud.dao.PaymentDao;
import com.eiletxie.springcloud.entities.Payment;
import com.eiletxie.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    //写操作
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    //读操作
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
