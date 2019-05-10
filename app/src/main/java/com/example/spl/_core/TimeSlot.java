package com.example.spl._core;

import java.util.Date;

public class TimeSlot {
  String info;
  Date dateStart;
  Date dateEnd;

  public TimeSlot() {
  }

  public TimeSlot(String info, Date dateStart, Date dateEnd) {
    this.info = info;
    this.dateStart = dateStart;
    this.dateEnd = dateEnd;
  }

  public String getInfo() {
    return this.info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public Date getDateStart() {
    return this.dateStart;
  }

  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }

  public Date getDateEnd() {
    return this.dateEnd;
  }

  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }

  public TimeSlot info(String info) {
    this.info = info;
    return this;
  }

  public TimeSlot dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }

  public TimeSlot dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }

  @Override
  public String toString() {
    return "{" + " info='" + getInfo() + "'" + ", dateStart='" + getDateStart() + "'" + ", dateEnd='" + getDateEnd()
        + "'" + "}";
  }

  void print() {
  }
}
