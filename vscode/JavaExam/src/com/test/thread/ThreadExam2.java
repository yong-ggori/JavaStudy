package com.test.thread;

class ExamClass2 extends Thread{ //runnable 과 달리 클래스를 상속 받기 때문에 다중 상속 불가능

    @Override
    public void run(){
        try {
            for(int idx=0; idx<30; idx++){
                Thread.sleep(1000);
                System.out.println("Thread1이 실행");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadExam2 {
    public static void main(String[] args) {
        ExamClass2 examClass2 = new ExamClass2();
        examClass2.start();

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
