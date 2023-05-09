package com.java.exception;

public class Bunny extends Hopper{
    public static void main(String[] args) {
        /*try {
            eatCarrot();
        } catch (NoMoreCarrotsException e){
            System.out.println("sad rabbit");
        }*/

        try{
            hop();
        }catch (Exception e){
            System.out.println(e);
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("yes");
    }
    private static void eatCarrot() throws NoMoreCarrotsException{
        System.out.println("I am a rabit");
        //throw new NoMoreCarrotsException();
    }

    public void bad(){
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e){
            System.out.println("sad rabbit");
        }
    }

    public void good() throws NoMoreCarrotsException{
            eatCarrot();

    }


    public static void hop(){
        //super.hop();
        int arr[] = {1,2,3};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
        //throw new RuntimeException("can't hop");
    }
}
