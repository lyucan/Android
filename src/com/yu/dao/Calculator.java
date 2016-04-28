package com.yu.dao;

/**
 * Created by lenovo on 2016/4/27.
 */
public class Calculator {
    private int numerator;
    private int denominator;
    public Calculator(){


    }
    public Calculator(int a,int b){
        if(a == 0){
            numerator = 0;
            denominator = 1;
        }
        else{
            setNumeratorAndDenominator(a,b);
        }

    }

  public   void setNumeratorAndDenominator(int a, int b){
        int c = f(Math.abs(a),Math.abs(b));
        numerator = a/c;
        denominator = b/c;
        if(numerator<0 && denominator<0){
            numerator = - numerator;
            denominator = - denominator;
        }
    }
    int f(int a,int b){
        if(a < b){
            int c = a;
            a = b;
            b = c;
        }
        int r = a % b;
        while(r != 0){
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public int getNumerator() {
        return numerator;
    }


    public int getDenominator() {
        return denominator;
    }


}
