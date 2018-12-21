package org.lanqiao.tx.dao.impl;

import org.lanqiao.tx.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {
    @Autowired
    CustomerDaoImpl(DataSource dataSource){
        setDataSource(dataSource);
    }
    @Override
    public void setMoney(double money) {
        String sql = "update  customer set money = money+?";
        this.getJdbcTemplate().update(sql,money);
    }
}
