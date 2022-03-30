package com.test.exam02;

class A{

    public void a() {
        System.out.println("파라미터가 없음");
    }
    public void a(int idx, int jdx){
        System.out.println("파라미터가 있음. "+idx+" "+jdx);
    }

}
public class OverloadingExam {
    public static void main(String[] args) {
        A a = new A();
        a.a();
        a.a(1,2); //오버로딩 : 메서드 명이 동일해도 변수(파라미터)에 따라 다르게 동작 함
    }
}
