package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.SetInjection;

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2020-11-12 17:12
 */
@Component
public class ServiceAA {

    private  ServiceBB serviceBB;
    public  void  setServiceBB(ServiceBB serviceBB) {
        this.serviceBB=serviceBB;
        System.out.println("AA中利用这个方法-得到BB");
    }
}
