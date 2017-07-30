package com.ygb.test.service;

/**
 * Created by yangguobiao on 2017/7/30.
 */
public class MacListService implements ListService {
  @Override
  public String showListCmd() {
    return "mac ls";
  }
}
