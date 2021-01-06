package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.constructor;

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2020-11-12 16:51
 */
@Component
public class ServiceB {

    private  ServiceA serviceA;


    public ServiceB(ServiceA serviceA ) {
        this.serviceA=serviceA;
    }
}
