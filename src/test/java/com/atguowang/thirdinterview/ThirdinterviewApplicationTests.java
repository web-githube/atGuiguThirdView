package com.atguowang.thirdinterview;

import com.atguowang.thirdinterview.spring.service.ClaNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * springboot的测试类
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ThirdinterviewApplicationTests {
    @Autowired
    private ClaNumber claNumber;

    @Test
    public void aop4() throws Exception {
         //打印
          System.out.println("spring的版本"+SpringVersion.getVersion()+","+"springboot的版本"+ SpringBootVersion.getVersion());
        claNumber.div(4,2);

    }



}
