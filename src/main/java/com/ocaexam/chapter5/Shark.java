package com.ocaexam.chapter5;

public class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
        System.out.println("shark"+this.getAge());
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: " + getAge());
        System.out.print("Shark with age: " + super.getAge());
        System.out.print("Shark with age: " + this.getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
        System.out.println(new Shark(8).getAge());
    }

    @Override
    public int getAge() {
        //return super.getAge();
        return 25;
    }

    public static void main(String[] args) {
        System.out.println(new Shark(5).getAge());
        System.out.println(new Fish(3).getAge());
        //System.out.print("Shark with age: " + super.getAge());
       new Shark(7).displaySharkDetails();
        new Shark(80).getAge(8);
    }

    public void getAge(int a){
        System.out.println(a);
    }
}
