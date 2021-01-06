package com.atguowang.thirdinterview.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author webstart
 * @time 2020/11/9/10:11
 * @description  aspect 面向切面编程
 **/
@Aspect
@Component
public class MyAOPAspect {

    @Before("execution(public  int com.atguowang.thirdinterview.spring.service.impl.ClaNumberImpl.*(..))")
    public void before(){
      //打印
       System.out.println("@before是前置通知myaspect");
    }

    @After("execution(public  int com.atguowang.thirdinterview.spring.service.impl.ClaNumberImpl.*(..))")
    public void after(){
        //打印
        System.out.println(" @After是后置通知myaspect"+"始终执行");
    }

    @AfterThrowing("execution(public  int com.atguowang.thirdinterview.spring.service.impl.ClaNumberImpl.*(..))")
    public void afterThrowing(){
        //打印
        System.out.println("@AfterThrowing运行错误，抛出异常后通知 ");
    }
    @AfterReturning("execution(public  int com.atguowang.thirdinterview.spring.service.impl.ClaNumberImpl.*(..))")
    public void afterReturn(){
        //打印
        System.out.println("@AfterReturning后置返回通知");
    }
//    @Around("execution(public  int com.atguowang.thirdinterview.spring.service.impl.ClaNumberImpl.*(..))")
//    public void around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
//        //打印
//        System.out.println(" @around环绕通知");
//    }
}
