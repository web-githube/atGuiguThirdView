package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.springIOC;



/**
 * @author maweibo
 * @create 2021-01-05 10:10
 * @description   spring容器中
 */

public class B {

    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    B(){

        System.out.println(" B -created- success");
    }

}
