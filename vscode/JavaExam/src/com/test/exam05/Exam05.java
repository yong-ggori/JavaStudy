package com.test.exam05;

//1. 인자가 없는 생성자 A() 실행
//2. aa 메소드 실행
//3. 인자가 2개인 메소드 bb 실행, 1+2=3
//4. 인자가 2개인 생성자 A(3,4) 실행 , return값 : c = 7 (3+4)
//5. 다른 객체의 c(a.c, aa.c) 출력, static 값이라 동일한 것을 확인

class A{ // 클래스 'A' 생성

    private int a; // 전역변수 선언
    private int b; // 접근제한자 'private' : 해당 클래스 내부에서만 사용 가능
    static int c; //static ; 컴파일 시 코드 및 데이터 영역이 생성되고 프로그램 종료 시 까지 데이터가 유지
    // 접근제한자들을 통해 다양한 전역 변수 선언 가능
    A(){// 인자가 없는 생성자 컴파일 시 자동으로 생성
        System.out.println("A 클래스가 생성");
        aa();
    } 
    A(int a, int b){// 인자가 2개인 생성자
        this.a = a;
        this.b = b;
        c = bb(a,b);// bb 메소드 : a+b
    }
    void aa(){ // 메소드 'aa'
        System.out.println("A 클래스의 aa 메소드");
    }
    int bb(int idx, int jdx){ //인자가 2개인 returnr값이 필요한 메소드
        return idx+jdx;
    }
    
}

//상속
abstract class C{ //부모 클래스(추상 클래스)
    int a;
    int b; //전역변수, 멤버변수

    void cc(){
        System.out.println("C 클래스 cc 메소드");
    }

    abstract void cc1(); //abstract 메소드, 추상 클래스와 추상 메소드는 실행부가 없다.
}
class D extends C{ //자식 클래스
    int d;
    int e;
    
    @Override //annotation : 컴파일러에게 오버라이딩이라고 안내해 주는 역할
    //, 오버라이딩 시 반드시 작성
    void cc1() { //abstract 메소드는 부모로부터 반드시 받아와 오버라이딩해서 실행해 주어야 한다.
        System.out.println("C 클래스의 cc1 메소드 오버라이딩!");
    }
    void dd(){
        System.out.println("D 클래스 dd 메소드");
    }


}

//인터페이스
interface E { //like blueprint, 설계도
    void ee1(); // 인터페이스는 실행부만 만들 수 있다.
    void ee2();
}
class F implements E{

    @Override
    public void ee1() {
        System.out.println("클래스 F의 ee1 메소드");
    }
    @Override
    public void ee2() {
        System.out.println("클래스 F의 ee2 메소드");
    }
    
}

//내부 클래스
class G{

    static class GG{ //내부 클래스는 static으로 만들 수 있다. 내부 메소드도 전부 static으로 ??
        int idx = 0;
        void gg(){
            System.out.println("GG내부 클래스 gg 메소드");
        }
    }

}

public class Exam05 {
    public static void main(String[] args) { // 'main 메소드' 모든 파일 내에서 가장 먼저 실행
                                            
        A a = new A();//기본적인 클래스 변수 선언 타입
        //new 지시어 : 뒤에 나오는 생성자 A()를 실행시켜 메모리에 로딩
        a.aa();
        System.out.println(a.bb(1, 2));

        A aa = new A(3,4); //인자 2개를 가진 A 클래스의 aa 객체, 참조형 변수 선언 heap 영역에 저장
        
        System.out.println(aa.c); //static이 붙은 변수 확인용
        System.out.println(a.c); //다른 클래스 변수라도 동일한 값이나온다.
        
        D d = new D(); //인자없는 디포트 생성자 뿐이다.
                    //상속 받는 자식 클래스는 부모 클래스의 변수 및 메소드를 모두 사용 가능
        d.cc1(); //부모 클래스의 메소드 사용

        F f = new F();
        f.ee1();
        f.ee2();

        new A(); // new 지시어로 메모리에 로딩만 해도 클래스를 실행할 수 있다.
                // 인자가 없는 생성자 A() 실행
        G.GG g = new G.GG(); //내부 클래스 선언 및 초기화
        g.gg();
    }
    
}
