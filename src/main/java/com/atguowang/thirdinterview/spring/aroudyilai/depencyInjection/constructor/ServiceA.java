package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.constructor;

import org.springframework.stereotype.Component;



/**
 * @author shkstart
 * @create 2020-11-12 16:51
 */
@Component
public class ServiceA {

    private ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        //当前私有的serviceB--
       this.serviceB=serviceB;
    }

}
