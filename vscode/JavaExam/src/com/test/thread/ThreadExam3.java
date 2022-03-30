package com.test.thread;


public class ThreadExam3 {
    public static void main(String[] args) {
        
        new Thread(new Runnable() { //생성자 기본 구성 "a() {}""

            @Override //인터페이스인 Runnable 메소드 오버라이딩
            public void run() {
                for(int idx=0; idx<30; idx++){
                    try {
                        Thread.sleep(1000);
                        System.out.println("Thread1이 실행");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start(); //anonymous 함수형

        for(int idx=0; idx<30; idx++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread2가 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
