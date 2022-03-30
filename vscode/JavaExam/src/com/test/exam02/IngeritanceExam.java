package com.test.exam02;

class Fruit{

    int color;
    int taste;

    void pop(){
        System.out.println("과일은 맛있어");
    }
}

class Apple extends Fruit{ //클래스 'apple'은 클래스 'Fruit'에 상속

    int price;
    int perfume;

    void cut(){
        System.out.println("사고를 잘라요.");
    }
}
public class IngeritanceExam {
    public static void main(String[] args) {
        
        Apple apple = new Apple(); //객체 'apple' 생성
        
        apple.pop(); //부모 class, 'Fruit'의 메서드 'pop' 사용 가능
        }
}
