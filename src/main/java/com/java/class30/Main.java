package com.java.class30;

import org.checkerframework.checker.units.qual.C;

class Shape {
    void draw(){
        System.out.println("drawing shape");
    }
    void erase(){
        System.out.println("erasing shape");
    }
}
 class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing circle");
    }

}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("drawing square");
    }
}
public class Main{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        s.erase();
        Circle c = new Circle();
        c.draw();
        Square sq = new Square();
        sq.draw();

    }
}
