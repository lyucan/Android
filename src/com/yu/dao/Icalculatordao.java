package com.yu.dao;

/**
 * Created by lenovo on 2016/4/27.
 */
public interface Icalculatordao {
    public Calculator add(Calculator a, Calculator b);
    public Calculator sub(Calculator a, Calculator b);
    public Calculator muti(Calculator a, Calculator b);
    public Calculator div(Calculator a, Calculator b);
    public  String compute(String data1,String operation,String data2);
}
