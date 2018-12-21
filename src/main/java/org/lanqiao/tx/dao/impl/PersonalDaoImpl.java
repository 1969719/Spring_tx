package org.lanqiao.tx.dao.impl;

import org.lanqiao.tx.dao.PersonalDao;
import org.lanqiao.tx.pojo.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
@Repository
public class PersonalDaoImpl extends JdbcDaoSupport implements PersonalDao {
    @Autowired
    PersonalDaoImpl(DataSource dataSource){
        setDataSource(dataSource);
    }


    @Override
    public void getMoney(double money) {
    String sql = "update personal set balance=balance - ?";
        this.getJdbcTemplate().update(sql,money);
    }

    @Override
    public double getAccout(int id) {
        String sql = "select balance from personal where id = ?";
        return this.getJdbcTemplate().queryForObject(sql,Double.class,id);

    }


    @Override
    public void setMoney(double money) {
        String sql = "insert into personal(account,balance) values(?,?)";
        this.getJdbcTemplate().update(sql,"0001",money);
    }
}
