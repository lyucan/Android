package com.yu.dao;

import java.util.StringTokenizer;

/**
 * Created by lenovo on 2016/4/27.
 */
public class Calculatordao implements Icalculatordao {
    int newDenominator;
    int newNumerator;

    @Override
    public Calculator add(Calculator a, Calculator b) {
        newNumerator=a.getNumerator()*b.getDenominator()+a.getDenominator()*b.getNumerator();
        System.out.println(newNumerator+" "+getNewDenominator(a,b));
        Calculator calculator=new Calculator(newNumerator,getNewDenominator(a,b));
        return calculator;
    }

    @Override
    public Calculator sub(Calculator a, Calculator b) {
        newNumerator=a.getNumerator()*b.getDenominator()-a.getDenominator()*b.getNumerator();
        Calculator calculator=new Calculator(newNumerator,getNewDenominator(a,b));
        return calculator;
    }

    @Override
    public Calculator muti(Calculator a, Calculator b) {
        newNumerator=a.getNumerator()*b.getDenominator();
        Calculator calculator=new Calculator(newNumerator,getNewDenominator(a,b));
        return calculator;

    }

    @Override
    public Calculator div(Calculator a, Calculator b) {
        newNumerator=a.getNumerator()*b.getDenominator();
        newDenominator=a.getDenominator()*b.getNumerator();
        Calculator calculator=new Calculator(newNumerator,newDenominator);
        return calculator;

    }

    @Override
    public String compute(String data1, String operation, String data2) {
        StringTokenizer fenxi = new StringTokenizer(data1,"/");
        int data1_1 = Integer.parseInt(fenxi.nextToken());
        int data1_2 = Integer.parseInt(fenxi.nextToken());
        fenxi = new StringTokenizer(data2,"/");
        int data2_1 = Integer.parseInt(fenxi.nextToken());
        int data2_2 = Integer.parseInt(fenxi.nextToken());

        Calculator r1 = new Calculator(data1_1,data1_2);
        Calculator r2 = new Calculator(data2_1,data2_2);

        Calculator result;
        if(operation.equals("+")){
            result=this.add(r1,r2);
            return String.valueOf(result.getNumerator()) + "/" + String.valueOf(result.getDenominator());

        }

        if(operation.equals("-")){
            result=this.sub(r1,r2);
            return String.valueOf(result.getNumerator()) + "/" + String.valueOf(result.getDenominator());

        }

        if(operation.equals("*")){
            result=this.muti(r1,r2);
            return String.valueOf(result.getNumerator()) + "/" + String.valueOf(result.getDenominator());

        }

        if(operation.equals("÷")){
            result=this.div(r1,r2);
            return String.valueOf(result.getNumerator()) + "/" + String.valueOf(result.getDenominator());

        }

        return  "无解";
    }


    public  int getNewDenominator(Calculator a, Calculator b){
         newDenominator= a.getDenominator()*b.getDenominator();
        return newDenominator;
    }

}
