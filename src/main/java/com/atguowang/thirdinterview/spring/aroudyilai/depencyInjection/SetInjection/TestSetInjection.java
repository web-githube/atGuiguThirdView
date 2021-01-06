package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.SetInjection;

import sun.java2d.pipe.AAShapePipe;

/**
 * @author shkstart
 * @create 2020-11-12 17:13
 */
public class TestSetInjection {


    public static void main(String[] args) {
        /**
         * 测试set方法注入的循环依赖
         */
        ServiceAA aa = new ServiceAA();
        ServiceBB bb = new ServiceBB();

        aa.setServiceBB(bb);
        bb.setServiceAA(aa);
    }

}
