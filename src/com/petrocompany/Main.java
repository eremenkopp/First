package com.petrocompany;

public class Main {

    public static void main(String[] args) {
	  byte b = 120;
	  short s = 500;
	  int i = 1000000;
	  long l = 10000000000L;
	  double d = 2500.2500;
	  float f = 2500.2500f;
	  boolean bool = true;
	  char ch = 'c';
	  final short varConst = 1000;
	  printWelcome("Artem");
	  checkYear(100);
        checkYear(2000);
        checkYear(1900);
        checkYear(1904);
    }

    public static float countExpr(float a, float b, float c, float d) {
        return a*(b+(c/d));
    }

    public static boolean checkSum (short a, short b){
        int sum = a+b;
        if ((sum > 10) && (sum <= 20)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void printCheckPositive (int num){
        if (num >= 0) {
            System.out.println(num + " это положительное число");
        }
        else{
            System.out.println(num + " это отрицательное число");
        }
    }

    public static boolean checkNegative (int num){
        if (num < 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void printWelcome (String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void checkYear(int year){
        if (year%4 == 0){
            if (year%100 == 0 && year%400 != 0) System.out.println(year + " год не является вискосным.");
            else                                System.out.println(year + " год является вискосным.");

        }
    }
}
