package com.atguowang.thirdinterview.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author lucas
 * @time 2020/11/1/14:52
 * @description  可可重入锁的关系和实现可重入锁
 **/
public class ReentrantLockTest {
     //开始进行lock的锁初始化
    static ReentrantLock reentrantLock=new ReentrantLock();
    //condition的是状态对比
    static Condition condition = reentrantLock.newCondition();
    public static void main(String[] args) {
        //创建新的线程
        new Thread(()->{
          try{
              //加锁
              reentrantLock.lock();
                 }catch (Exception e){
             e.printStackTrace();
                 }finally {
                   reentrantLock.unlock();//解锁
                 }



        },"test1").start();

    }
}
