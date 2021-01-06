package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.SetInjection;

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2020-11-12 17:13
 */
@Component
public class ServiceBB {

    private  ServiceAA serviceAA;

    public void setServiceAA(ServiceAA serviceAA){
        this.serviceAA=serviceAA;
        System.out.println("B中得到这个方法A的赋值");
    }
}
