package com.atguowang.thirdinterview.juc;

/**
 * @author webstart
 * @time 2020/10/26/10:41
 * @description  synchronized中对于可重入锁的验证:同步方法
 **/
public class TestSyn2 {

    public  synchronized void m1(){
         //打印
          System.out.println("外");
          m2();
    }

    public  synchronized void m2(){
        //打印
        System.out.println("中");
        m3();
    }

    public  synchronized void m3(){
        //打印
        System.out.println("内");

    }

    public static void main(String[] args){

        new TestSyn2().m1();
    };
    }














