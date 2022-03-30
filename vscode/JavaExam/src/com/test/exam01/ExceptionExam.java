package com.test.exam01;

class ErrorTest{
    public void errormaking() throws ArithmeticException{
        int a = 4/0;
        System.out.println("a = "+a);
    }
}

class FoolExeption extends Exception{ // Exception 이라는 class에서 상속 받는다.

} 

public class ExceptionExam {

    public void sayNickname(String nickname){
        if(nickname.equals("fool"))
            try {
                throw new FoolExeption(); // 강제적으로 예외를 발생
            } catch (FoolExeption e) {
                System.err.println("FollException이 발생했습니다.");
            }
        System.out.println("당신의 별명은 "+nickname+"입니다.");
    }
    public static void main(String[] args) {
        int c;
        try{ // error 날것 같은 곳 묶어줌
            c=4/0;
            System.out.println("다행");
        } catch(ArithmeticException e){
            c=-1; // 예외 발생시 조치할 부분
        } finally{ // 예외가 발생하더라도 실행시켜야 할 부분
            System.out.println("다행인가?");
        }
        System.out.println("c = "+c);

        // ErrorTest errorTest = new ErrorTest();
        // errorTest.errormaking();

        ExceptionExam exam = new ExceptionExam();
        // exam.sayNickname("fool");
        exam.sayNickname("genius");
    }
}
