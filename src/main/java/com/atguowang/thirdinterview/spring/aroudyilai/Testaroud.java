package com.atguowang.thirdinterview.spring.aroudyilai;

import com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.springIOC.A;

import java.util.Date;
import java.util.UUID;

/**
 * @author lucas
 * @create 2020-11-12 15:39
 */
public class Testaroud {


    public static void main(String[] args) {

//        System.out.println(UUID.randomUUID().toString());
//        System.out.println(UUID.randomUUID().toString().length());
//
//        System.out.println(UUID.randomUUID().toString().replaceAll("-",""));
        System.out.println(System.currentTimeMillis());

        System.out.println(new Date().getTime());

//        Object a=new A();
//        Object b=new Object();
//        System.out.println(a.getClass());
//        System.out.println(b.getClass());

    }
}
