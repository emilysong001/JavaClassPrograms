package com.java.class28;

import net.bytebuddy.asm.Advice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date {
    public static void main(String[] args){
        //LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2023, Month.JANUARY,25);
        //System.out.println(date1);
        System.out.println(date2);
       /* LocalTime time1 = LocalTime.of(1,50);
        LocalTime time2 = LocalTime.of(1,20,50);
        System.out.println(time1);
        System.out.println(time2);
        LocalDateTime dt = LocalDateTime.of(2023,1,22,5,30);
        System.out.println(dt);
        date1 = date1.plusDays(1);
        System.out.println(date1);
        time1.plusHours(1);
        System.out.println(time1);*/
        Period p1 =Period.ofMonths(1);//1 month +1 day //initialize new object
        //p.ofMonths(1);
        Period p = p1.ofDays(1); //initialize
        //Period p =Period.ofDays(1);//1 moth
        date2= date2.plus(p); //1/25 + 1
        System.out.println(date2);
        /*System.out.println(date1.getYear());

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //System.out.println(dtf.format(date1));
        //System.out.println(dtf.format(time1));
        System.out.println(dtf.format(dt));
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf2.format(time1));
       // System.out.println(dtf2.format(date1));
        System.out.println(dtf2.format(dt));
        LocalTime time3 = LocalTime.parse("01:22");
        System.out.println(time3);
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        String str = "Emily";
        str = str.concat(" is ")
        System.out.println(str);*/

    }
}
