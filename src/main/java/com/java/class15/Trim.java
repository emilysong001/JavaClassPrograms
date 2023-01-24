package com.java.class15;

public class Trim {
    //remove the whitespace end and start
    public static void main(String[] args) {
        String str = "Elon ";
        boolean isEqual = str.equals("Elon");
        System.out.println(isEqual);

        String answer = "Yes ";
        String answerWithoutSpace = answer.trim();
        boolean yesOrNo = answerWithoutSpace.equalsIgnoreCase("yes");
        System.out.println(answerWithoutSpace);
        System.out.println(yesOrNo);

        switch (answer.toLowerCase().trim()){
            case "yes":
                System.out.println("Answer is Yes");
                break;
            case "no":
                System.out.println("Answer is No");
                break;
        }

        if (answer.trim().equalsIgnoreCase("yes")) {
            System.out.println("hello");
        }
    }
}
