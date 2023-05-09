package com.selflearning.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.TimeZone;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.ofYearDay(2023, 100);
        System.out.println(LocalDate.now().getYear());
        LocalDate today = LocalDate.now();
        System.out.println(today.isBefore(LocalDate.of(2023, 04, 25)));
        System.out.println(ld);
        LocalTime lt = LocalTime.of(5, 10, 50, 2500);
        System.out.println(lt);

        //Temporal adjusters for adjusting the dates
        System.out.println("Last date of this month= " + today.with(TemporalAdjusters.lastDayOfMonth()));
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last date of this year= " + lastDayOfYear);

        Period period = today.until(lastDayOfYear);
        System.out.println("Period Format= " + period);
        System.out.println("Months remaining in the year= " + period.getMonths());

        System.out.println(ld.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(ld.format(DateTimeFormatter.ofPattern("MM-dd-yy")));

        //Parse examples
        LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
                DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing = " + dt);

        //TimeZone to ZoneId
        ZoneId defaultZone = TimeZone.getDefault().toZoneId();
        System.out.println(defaultZone);

        // BASIC_ISO_DATE formatter can parse date in yyyyMMdd format
        LocalDate date = LocalDate.parse("20150927", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("date string : 20150927, " + "localdate : " + date);
        // The ISO date formatter format or parse date in yyyy-MM-dd format
        // such as '2015-09-27' or '2015-09-27+01:00'
        // This is also the default format of LocalDate, if you print LocalDate
        // it prints date in this format only.
        date = LocalDate.parse("2015-09-27", DateTimeFormatter.ISO_DATE);
        System.out.println("date string : 2015-09-27, " + "localdate : " + date);

        DateTimeFormatter french = DateTimeFormatter.ofPattern("d. MMMM yyyy", new Locale("fr"));
        String frenchDate = LocalDate.now().format(french);
        System.out.println("Date in french format: " + frenchDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        // DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("de"));
        String germanDateTime = LocalDateTime.now().format(formatter);
        System.out.println("Date in short german format : " + germanDateTime);
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.getAvailableZoneIds());

        LocalDateTime ldt = LocalDateTime.of(2013, 04, 25, 10, 25, 42);
        ZonedDateTime zd = ZonedDateTime.of(ldt, ZoneId.of("America/Chicago"));
        System.out.println(zd.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        LocalDateTime ld2 = LocalDateTime.now();
        LocalDateTime ld3 = LocalDateTime.now(ZoneId.systemDefault());
        System.out.println(ld2);
        System.out.println(ld3);

    }
}
