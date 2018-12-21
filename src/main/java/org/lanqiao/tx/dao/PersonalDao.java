package org.lanqiao.tx.dao;

import org.lanqiao.tx.pojo.Personal;

public interface PersonalDao {
    //支出
    public void getMoney(double money);
    //支出
    public double getAccout(int id);
    //收入
    public void setMoney(double money);

}
