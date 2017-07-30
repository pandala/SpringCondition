package com.ygb.test.config;

import com.ygb.test.condition.LinuxCondition;
import com.ygb.test.condition.MacCondition;
import com.ygb.test.condition.WindowsCondition;
import com.ygb.test.service.LinuxListService;
import com.ygb.test.service.ListService;
import com.ygb.test.service.MacListService;
import com.ygb.test.service.WindowsListService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yangguobiao on 2017/7/30.
 */
@Configuration
public class ConditionConfig {
  @Bean
  @Conditional(WindowsCondition.class)
  public ListService windowsListService() {
    return new WindowsListService();
  }

  @Bean
  @Conditional(LinuxCondition.class)
  public ListService linuxListService(){
    return new LinuxListService();
  }

  @Bean
  @Conditional(MacCondition.class)
  public ListService macListService(){
    return new MacListService();
  }
}
