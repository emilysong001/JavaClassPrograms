package com.java.class05;

public class ConditionalAnd {
    public static void main(String[] args) {
        //Conditional And is used when you want to enforce multiple rules
        //before you execute your logic
        //all of the rules must be met

        //
        boolean giveSezimCertificate = false;
        double sezimGPA = 4.0;
        int sezimMissedClasses =3;

        giveSezimCertificate = sezimGPA>3.5 && sezimMissedClasses <3;
        System.out.println(giveSezimCertificate);

        boolean giveEmilyCertificate = false;
        double emilyGPA = 3.6;
        int emilyMissedClasses =0;

        giveEmilyCertificate = emilyGPA>3.5 && emilyMissedClasses <3;
        System.out.println("Give Emily Certificate? "+giveEmilyCertificate);

        System.out.println("------------------");

        boolean issueDriverLicense = false;
        int emilyAge = 30;
        boolean passport = true;
        // Avoid writing passport==true type of comparison;
        issueDriverLicense = emilyAge>16 && passport;
        System.out.println("Give Emily Driver License? "+issueDriverLicense);



    }
}
