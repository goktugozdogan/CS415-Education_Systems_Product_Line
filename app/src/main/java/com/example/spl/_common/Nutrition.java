package com.example.spl._common;

import java.util.Date;
import java.util.Map;

public class Nutrition extends PhysicalEducationFeatures {
  Date date;
  Map<String, String> macroTable;

  public Nutrition() {
  }

  public Nutrition(Date date, Map<String, String> macroTable) {
    this.date = date;
    this.macroTable = macroTable;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Map<String, String> getMacroTable() {
    return this.macroTable;
  }

  public void setMacroTable(Map<String, String> macroTable) {
    this.macroTable = macroTable;
  }

  public Nutrition date(Date date) {
    this.date = date;
    return this;
  }

  public Nutrition macroTable(Map<String, String> macroTable) {
    this.macroTable = macroTable;
    return this;
  }

  @Override
  public String toString() {
    return "{" + " date='" + getDate() + "'" + ", macroTable='" + getMacroTable() + "'" + "}";
  }

}
