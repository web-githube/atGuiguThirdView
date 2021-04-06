package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.springIOC;

/**
 * @author maweibo
 * @create 2021-01-05 10:13
 * @description set注入
 */

public class Code {

    public static void main(String[] args) {
        A a=new A();

        B b=new B() ;

        //set注入
        b.setA(a);
        a.setB(b);
        System.out.println();
    }



}
