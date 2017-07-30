package com.ygb.test.service;

/**
 * Created by yangguobiao on 2017/7/30.
 */
public class WindowsListService implements ListService {
  @Override
  public String showListCmd() {
    return "dir";
  }
}
