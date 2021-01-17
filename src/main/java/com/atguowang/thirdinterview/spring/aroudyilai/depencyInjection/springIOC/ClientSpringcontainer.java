package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author maweibo
 * @create 2021-01-05 10:38
 * @description
 */
public class ClientSpringcontainer {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        A a=context.getBean("a",A.class);
        B b=context.getBean("b",B.class);


        System.out.println("hello mac");
    }
}
