package com.test.exam02;

class Family{
    void hello(){
        System.out.println("인사합시다");
    }
    //void dinner(){} 
}

class kimFamily extends Family{
    void hello(){
        System.out.println("김선생 잘 지내나?");
    }
    void dinner(){
        System.out.println("김선생 밥이나 한 번 먹자구");
    }
    void drink(){
        System.out.println("술");
    }
}

class parkFamily extends Family{
    void hello(){
        System.out.println("박선생 안녕한가");
    }
    void fishing(){
        System.out.println("박선생 낚시나 하자고");
    }
}
public class PolymorpismExam {
    public static void main(String[] args) {
        
        Family kimF = new kimFamily();
        kimF.hello(); //오버 라이딩?

        Family parkF = new parkFamily();
        parkF.hello(); //오버 라이딩?
    }
}
