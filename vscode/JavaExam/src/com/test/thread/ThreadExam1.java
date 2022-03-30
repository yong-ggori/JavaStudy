package com.test.thread;

class ExamClass implements Runnable{

    @Override
    public void run() {
        for(int idx=0; idx<30; idx++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread1가 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }
    }
    
}

public class ThreadExam1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ExamClass());
        thread.start();
    
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
