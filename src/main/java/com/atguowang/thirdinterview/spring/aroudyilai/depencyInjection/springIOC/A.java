package com.atguowang.thirdinterview.spring.aroudyilai.depencyInjection.springIOC;


/**
 * @author maweibo
 * @create 2021-01-05 10:09
 * @description spring容器中关于循环依赖的实现
 */
public class A {

    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    A(){
        System.out.println(" A -created- success");
    }

}
