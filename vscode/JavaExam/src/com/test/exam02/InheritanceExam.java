package com.test.exam02;

class Parents {
    //생성자는 클래스의 전역변수(멤버변수)를 초기화 시킨다.
    //생성자는 클래스의 인스턴스가 생성될 때 가장 먼저 실행되어
    //생성자 내에서 기술된 명령문을 실행한다.

    //this.전역변수 ; 해당 클래스 내의 전역변수를 의미, super.전역변수 ; 상위 클래스(부모 클래스)의 전역변수를 의미
    //this, super -> "지시어", 명령어, 예약어, 키워드
    Parents(){
        this(1); //자신의 인자 1개를 받는 생성자를 호출
        System.out.println("인자가 없는 Parents 클래스의 생성자");
    }//Parents의 기본 생성자 역할, 정수 형태라면 0 string 형태라면 'null'로 초기화

    Parents(int i){
        System.out.println("인자가 1개인 Parents 클래스의 생성자");
    }
}

class Child extends Parents {

    int c1;
    int c2;

    Child(int c1, int c2){
        super(c2);
        this.c1=c1;
        this.c2=c2;
        //super(c1); constructor(생성자) call은 반드시 생성자 내에서 첫번째로 지시되어야 함 
    }

    Child(){
        super(); //부모 클래스의 생성자를 호출, 정수 1 넣을 시
        System.out.println("인자가 없는 Child 클래스의 생성자");

    }
}

// class grandChild extends Child{
//     grandChild(){
//         super(1); //error, Child 클랫 내의 정수 1을 받는 생성자 없음
//         System.out.println("엘렐렐레");
//     }
// }

public class InheritanceExam {
    public static void main(String[] args) {
        Child child = new Child(1, 2); //Child 클래스를 인스턴스화 시켜서 child 생성
        //grandChild grad = new grandChild();
        System.out.println("Child Class의 전역 변수 : "+child.c1+" "+child.c2);
        
    }
}
