package com.ygb.test.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by yangguobiao on 2017/7/30.
 */
public class MacCondition implements Condition{
  @Override
  public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
    return conditionContext.getEnvironment().getProperty("os.name").contains("Mac");
  }
}
