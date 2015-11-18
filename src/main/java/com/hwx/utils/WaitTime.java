package com.hwx.utils;

/**
 * Created by ajain on 11/5/15.
 */
public enum WaitTime {

  SHORTWAIT(1),
  MEDIUMWAIT(10),
  LONGWAIT(30);

  private final int waitTime;

  private WaitTime(int waitTime){
    this.waitTime = waitTime;
  }

  public int getTime(){
    return waitTime;
  }

}
