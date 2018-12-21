package org.lanqiao.tx.Service.impl;

import org.lanqiao.tx.Service.PersonalService;
import org.lanqiao.tx.dao.CustomerDao;
import org.lanqiao.tx.dao.PersonalDao;
import org.lanqiao.tx.ex.PayException;
import org.lanqiao.tx.pojo.Customer;
import org.lanqiao.tx.pojo.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service

public class PersonalServiceImpl implements PersonalService {
@Autowired
private PersonalDao personalDao;
@Autowired
private CustomerDao customerDao;
    @Override
    //支付的方法
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {PayException.class})
    public void pay(double money) {
        personalDao.getMoney(money);
        if (1==1){
            throw new PayException("支付异常.......");
        }
        customerDao.setMoney(money);
    }
    //保存的方法
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void setMoney(double money) {
        personalDao.setMoney(money);
    }
    //获取的方法
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public double getAccout(int id) {
        return personalDao.getAccout(id);
    }
}
