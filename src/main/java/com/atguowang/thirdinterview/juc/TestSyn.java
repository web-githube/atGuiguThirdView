package com.atguowang.thirdinterview.juc;

/**
 * @author webstart
 * @time 2020/10/26/10:41
 * @description  synchronized中对于可重入锁的验证:同步代码块
 **/
public class TestSyn {
     //老伙计-线程操作资源类


    static Object dataTest=new Object();

    //
    static void  m1(){
       new Thread(()->{
          synchronized (dataTest){ System.out.println(Thread.currentThread().getName()+"\t"+"外层区域"); }
          synchronized (dataTest){ System.out.println(Thread.currentThread().getName()+"\t"+"中层区域");}
          synchronized (dataTest){ System.out.println(Thread.currentThread().getName()+"\t"+"中层区域");}
          },"maweibo").start();

    }


    public static void main(String[] args) {
        m1();
    }














}
