package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.constructor;

/**
 * @author shkstart
 * @create 2020-11-12 16:51
 */
public class TestConstructor {
    public static void main(String[] args) {

        //循环相互依赖，在构造器Constructor中无法解决，像俄罗斯套娃一样的，永恒不进
//        new  ServiceA(new ServiceB(new ServiceA(new ServiceB()) ));
    }



}
