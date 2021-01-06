package com.atguowang.thirdinterview.spring.service.impl;

import com.atguowang.thirdinterview.spring.service.ClaNumber;

/**
 * @author webstart
 * @time 2020/11/9/10:03
 * @description
 **/
public class ClaNumberImpl implements ClaNumber {
    @Override
    public int div(int x, int y) {
        try {
            int result = x / y;
            //打印
            System.out.println("执行div的除法方法被调用，计算结果是=" + result);

           return result;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return 0;
    }
}