package org.lanqiao.tx;

import org.lanqiao.tx.Service.PersonalService;
import org.lanqiao.tx.Service.impl.PersonalServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
        PersonalService personalService = context.getBean("personalServiceImpl", PersonalServiceImpl.class);
       // personalService.setMoney(100.00);
        personalService.pay(10);
    }
}
