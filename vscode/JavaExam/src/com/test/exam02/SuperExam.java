package com.test.exam02;

class Point{

    int x = 10;
    int y = 20;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point{

    int z = 30;

    Point3D(){
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z){
        super(x, y);//부모 클래스의 인자가 두 개 있는 생성자 호출
        this.z = z;
    }

}

public class SuperExam {
    public static void main(String[] args) {
        Point3D point3d = new Point3D(); //Point3d의 인스턴스화 > 'point3d', 이후 Point3d의 인자가 없는 생성자 호출
        System.out.println("Point3D의 x, y, z = "+point3d.x+", "+point3d.y+", "+point3d.z);
    }
}
