package com.ravi.cal.RaviCalculator;

import java.util.Scanner;


public class Calculator {

     private long first;
     private long second;

     private long getFirst() {
       return first;
      }

    public void setFirst(long first) {
       this.first = first;
      }

    private long getSecond() {
       return second;
     }

    public void setSecond(long second){
        this.second = second;
    }

    public long addFunc(long first, long second) {
       return first+second;
    }

    public long subFunc(long first,long second)
    {
       return second-first;
    }


    public long mulFunc(long first, long second)
    {
        return first*second;
    }

   public static void main(String[] args)
   {
   Calculator cc = new Calculator();
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter the first numeric value:");
   long first = sc.nextlong();
   cc.setFirst(first);

   System.out.println("Enter the second numeric value:");
   long second = sc.nextLong();
   cc.setSecond(second);

   System.out.println("The Sum of two numbers is:" +cc.addFunc(first,second));
   System.out.println("The difference of two numbers is:"+cc.subFunc(first,second));
   System.out.println("The Multiplication of two numbers is:"+cc.mulFunc(first,second));

  }

}
   










