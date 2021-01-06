package com.atguowang.thirdinterview.javabase;

/**
 * @author webstart
 * @time 2020/10/20/22:41
 * @description 字符串常量池的面试
 **/
public class TestString58 {
    public static void main(String[] args) {
//        String str1=new StringBuffer("2020/10/20").append("22:45").toString();
//         //打印
//          System.out.println(str1);
//        System.out.println(str1.intern());
//         //打印
//          System.out.println(str1 == str1.intern());


        String str2 = new StringBuffer("ja").append("va").toString();
        //打印
        System.out.println(str2);
        System.out.println(str2.intern());
        System.out.println("java".intern());
        System.out.println(str2 == str2.intern());
        System.out.println("java" == "java".intern());
        System.out.println(str2 == "java");//引用地址不同

//
//        String str3=new StringBuffer("hell").append("alibaba").toString();
//        //打印
//        System.out.println(str3);
//        System.out.println(str3.intern());
//        //打印
//        System.out.println(str3 == str3.intern());
    }


}
