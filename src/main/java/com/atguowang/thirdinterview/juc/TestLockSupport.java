package com.atguowang.thirdinterview.juc;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author mawiebo
 * @time 2020/10/27/10:29
 * @description 锁对象，是什么，能干嘛，从哪里下，怎么玩
 * AB学习法
 **/
public class TestLockSupport {
    //锁对象
    static Object data = new Object();

    public static void main(String[] args) {


        new Thread(() -> {
            //暂停几秒钟
            //try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
            synchronized (data) {
                System.out.println(Thread.currentThread().getName() + "\t" + "---线程come in");
                try { data.wait(); //等待操作
                      System.out.println("处于被等待的状态");
                      data.notify();
                        System.out.println("处于一个唤醒的状态");
                } catch (InterruptedException e) {
                    e.printStackTrace(); }
                System.out.println(Thread.currentThread().getName() + "\t" + "被唤醒"); }
        }, "A").start();


//        第二个线程开始唤醒；

        new Thread(() -> {
            synchronized (data) {
                data.notify();
                System.out.println(Thread.currentThread().getName() + "\t" + "通知");
            }

        }, "B").start();
    }
}
