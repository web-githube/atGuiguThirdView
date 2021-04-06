package com.atguowang.thirdinterview.spring.service.impl;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author webstart
 * @time 2020/11/9/10:03
 * @description
 **/

@Component(value = "add") //id
public class ClaNumberImpl  {

    @Test
    public int add(int x, int y) {
        try {
            int result = x + y;
            //打印
            System.out.println("执行添加法被调用，计算结果是=" + result);

           return result;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return 0;
    }
}