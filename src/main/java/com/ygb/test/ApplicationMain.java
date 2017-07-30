package com.ygb.test;

import com.ygb.test.config.ConditionConfig;
import com.ygb.test.service.ListService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yangguobiao on 2017/7/30.
 */
public class ApplicationMain {
  public static void main(String[] args) {
    System.out.println("hello world");


    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ConditionConfig.class);

    ListService listService = context.getBean(ListService.class);
    System.out.println(context.getEnvironment().getProperty("os.name") + "\t" + "系统下的列表命令为：" + listService.showListCmd());
  }
}
