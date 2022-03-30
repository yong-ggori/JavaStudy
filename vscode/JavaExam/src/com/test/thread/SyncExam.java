package com.test.thread;

class ExamA{
    public void ExamA1(String thread){
        System.out.println("ExamA1 시작");
        synchronized(this){
            for(int idx=0; idx<3; idx++) {
                System.out.println("thread : "+thread+", ExamA1 : "+idx);
            }
        }
        System.out.println("ExamA1 끝");
    }  
    public synchronized void ExamA2(String thread){
        System.out.println("ExamA2 시작");
        for(int idx=0; idx<3; idx++) {
            System.out.println("thread : "+thread+", ExamA2 : "+idx);
        }
        System.out.println("ExamA2 끝");
    } 
}

public class SyncExam {
    public static void main(String[] args) {
        ExamA examA = new ExamA();

        Thread thread1 = new Thread(new Runnable() {

            @Override //Runnable 인터페이스 사용하기 때문에 오버라이딩
            public void run() {
                examA.ExamA1("Thread1");
            }       
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override //Runnable 인터페이스 사용하기 때문에 오버라이딩
            public void run() {
                examA.ExamA2("Thread2");
            }                   
        });

        thread1.start();
        thread2.start(); //thread는 반드시 .start로 시작 해 주어야 한다.
    }
}
