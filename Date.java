package newpackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * *
 * Date class has 6 data fields day, month, year, hour, minuet and 
 * 1 constructors and 2 methods
     **
 */
public class Date {

    /**
     * *
     * Construct a default constructor
    **
     */

    public Date() {
    }

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minet;
    Scanner in = new Scanner(System.in);
    // public static  ArrayList<Date>dateList=new ArrayList<Date>();

    /**
     * *
     * Construct arguments with the troId, day, month, year, hour, minuet
     *
     * @param day
     * @param month
     * @param year
     * @param hour
     * @param minet
    **
     */
    public Date(int day, int month, int year, int hour, int minet) {

        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minet = minet;
    }

    /**
     * *
     * getDay() method don't take anything and returns int day
     *
     * @return day 
    **
     */
    public int getDay() {
        return day;
    }

    /**
     * *
     * setDay() method take int day and save it in day and don't return anything
     *
     * @param day
    **
     */

    public void setDay(int day) {
        this.day = day;
    }

    /**
     * *
     * getMonth() method don't take anything and returns int month
     *
     * @return month
    **
     */
    public int getMonth() {
        return month;
    }

    /**
     * *
     * setMonth() method take int month and save it in month and don't return
     * anything
     *
     * @param month
    **
     */

    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * *
     * getYear() method don't take anything and returns int year
     *
     * @return 
    **
     */
    public int getYear() {
        return year;
    }

    /**
     * *
     * setYear() method take int year and save it in year and don't return
     * anything
     *
     * @param year
    **
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * *
     * getHoure() method don't take anything and returns int hour
     *
     * @return 
    **
     */
    public int getHour() {
        return hour;
    }

    /**
     * *
     * setHoure() method take int hour and save it in hour and don't return
     * anything
     *
     * @param hour
    **
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * *
     * getMinet() method don't take anything and returns int minuet
     *
     * @return 
    **
     */
    public int getMinet() {
        return minet;
    }

    /**
     * *
     * setMinet() method take int minuet and save it in minuet and don't return
     * anything
     *
     * @param Minet
    **
     */
    public void setMinet(int Minet) {
        this.minet = Minet;
    }

    /**
     * *
     * ask() method don't take anything and return date use scanner to enter int
     * day, month, year, hour, minuet and we stored it in an array list then we
     * used Exceptions Handling in enter the date you want, because maybe the
     * user enter Character instead of number
     *
     * @return 
    **
     */
    public Date ask() {
        try {

            System.out.println("\n---------------the date today is: " + java.time.LocalDate.now() + "---------------");
            System.out.println("\nplease enter the date and time of your Appointment : ");
            System.out.println("day: ");
            do {
                System.out.println("Please Enter a day between 1 and 31:");
                day = in.nextInt();
            } while (!(day >= 1) || !(day <= 31));
            System.out.println("month: ");
            do {
                System.out.println("Please Enter a month between 1 and 12:");
                month = in.nextInt();
            } while (!(month >= 1) || !(month <= 12));
            System.out.println("year: ");
            do {
                System.out.println("Please Enter a year between 2022 and 2023!:");
                year = in.nextInt();

            } while (!(year == 2022 || year == 2023));
            System.out.println("hour: ");
            do {
                System.out.println("Please Enter an hour between 1 and 12:");
                hour = in.nextInt();
            } while (!(hour >= 1) || !(hour <= 12));
            do {
                System.out.println("Please Enter a minuet between 0 and 60:");
                System.out.println("minet: ");
                minet = in.nextInt();

            } while (!(minet >= 0) || !(minet <= 60));
        } catch (Exception e) {
            System.err.println("PLEASE ENTER A NUMBER !!");
        }

        setDay(day);
        setHour(hour);
        setMinet(minet);
        setMonth(month);
        setYear(year);
        Date d = new Date(day, month, year, hour, minet);

        return d;
    }

    /**
     * *
     * toString() method override from super class PInformation don't take
     * anything and return a String take toString from Super class and add day,
     * month, year, hour, minuet print the day, month, year, hour, minuet
     **
     */
    @Override
    public String toString() {
        return "Date{" + day + " / " + month + " / " + year + " at " + hour + ":" + minet + '}';
    }
}
