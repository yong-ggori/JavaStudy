package com.test.exam01;

class Number{
    static int a=0;
    int b=0;

    static void print(){
        System.out.println("static method test !!!");
    }

    void print1(){
        System.out.println("instance method test !!!");
    }
}
@SuppressWarnings("all") //아래 클래스 오류 전부 무시
public class StaticExam {
    public static void main(String[] args) {
        Number number1 = new Number(); //객체 생성
        Number number2 = new Number(); //객체 생성
   
        number1.a = 1;
        number1.b = 1;
        
        System.out.println(number2.a+" "+number2.b);

        Number.print();
        number1.print1();
    }
}
