package com.java.class05;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);

        int numberOfClients =0;

        numberOfClients++; //numberOfClients+=1; numberOfClients = numberOfClients+1;
        System.out.println(numberOfClients);

        numberOfClients++;
        System.out.println(numberOfClients);

        numberOfClients++;
        System.out.println(numberOfClients);

        numberOfClients += 3; //numberOfClients = numberOfClients+3;
        System.out.println(numberOfClients);
        System.out.println("--------------");

        double gasPrice =3.99;
        gasPrice++;
        System.out.println(gasPrice);

        //pre increment/decrement ---it changes its own value, plus return the changed value
        //post increment/decrement -- it changes its own value, but return the old value

        double gasPriveAfterTax = gasPrice++;
        System.out.println(gasPrice);
        System.out.println(gasPriveAfterTax);

        int num =1;
        int y = num++;
        System.out.println(num);
        System.out.println(y);

        /*int num1 =1;
        int y1 = num1++;
        System.out.println(num1);
        System.out.println(y1);*/

        System.out.println("-----------");
        int z=10;
        int r=z++;
        System.out.println(r);
        System.out.println(z);//z=11
        System.out.println(z++);
        System.out.println(z);

        System.out.println("-----------");
        int u=11;
        int q=u++; // q=11; u=12;
        int t=q++; // q=12; t=11;
        System.out.println(u); //12
        System.out.println(q); //12
        System.out.println(t); //11

        int ab =50;
        int ac = ab++; //ab=51; ac=50
        int ad = ++ab; //ab=52; ad=52
        System.out.println(ad++); //52
        System.out.println(++ab); //53

        // int tempVar = ab++;
        //System.out.println(tempVar); //53
        System.out.println(ab++); //53
        System.out.println(ab++); //54
        System.out.println(ab); //55

        int var1 =20;
        System.out.println(var1++); //20; var1=21;
        System.out.println(++var1); //22; var1=22;

        int var2 = var1++; // 22, var1 = 23
        int var3 = ++var1; // 24, var1 = 24

        System.out.println(var1); //24
        System.out.println(var2); //22
        System.out.println(var3); //24

    }

}
