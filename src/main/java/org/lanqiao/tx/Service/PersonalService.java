package org.lanqiao.tx.Service;

import org.lanqiao.tx.pojo.Personal;

public interface PersonalService {
    public void pay(double money);
    public void setMoney(double money);
    public double getAccout(int id);
}
