package homes.canlender;

import java.util.Scanner;

public class Calendar {
    private final int[] MAX_DAYS={0,31,28,31,30,31,30,31,31,30,31,30,31};
    private final int[] LEAP_MAX_DAYS={0,31,29,31,30,31,30,31,31,30,31,30,31};

    public boolean isLeapYear(int year){
        if (year %4 ==0 && (year %100 !=0 || year %400 ==0)){
            return true;
        }else{
            return false;
        }
    }
    //윤년 구하기
    public int maxDaysOfMonth(int year,int month){
        if(isLeapYear(year)){
            return LEAP_MAX_DAYS[month];
        }else {
            return MAX_DAYS[month];
        }

    }
    public void printCalendar(int year,int month){
        System.out.printf("         <<%d년%d월>>\n",year,month);
        System.out.println("  일  월  화   수  목   금  토");
        System.out.println("-----------------------------");

        // get weekday automatically
        int weekday =getWeekday(year,month,1);

        for(int i=0;i<weekday;i++){
            System.out.print("\t");
        }
        for(int i=1;i<=maxDaysOfMonth(year,month);i++){
            if((i+weekday)%7==0){
                System.out.printf("%3d\n",i);
            }else {
                System.out.printf("%3d\t",i);
            }
        }
        System.out.println();
//        System.out.println(" 1  2  3  4  5  6  7 ");
//        System.out.println(" 8  9 10 11 12 13 14 ");
//        System.out.println("15 16 17 18 19 20 21 ");
//        System.out.println("22 23 24 25 26 27 28 ");
    }

    private int getWeekday(int year, int month, int day) {
        int syear =1970;
        final int STANDARD_WEEKDAY =4; //1970-01-01 목요일

        int count = 0;
        for(int i= syear; i< year; i++){
            int delta=isLeapYear(i) ? 366 : 365;
            count+=delta;
        }

        for(int i=1; i<month;i++){
            int delta=maxDaysOfMonth(year,i);
            count+=delta;
        }
        count+=day-1;
        int weekday = (count+STANDARD_WEEKDAY)%7;
        return weekday;
    }

    public static void main(String[] args){

    }

}
