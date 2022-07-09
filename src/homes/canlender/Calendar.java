package homes.canlender;

import java.util.Scanner;

public class Calendar {
    private final int[] MAX_DAYS={30,28,31,30,31,30,31,31,30,31,30,31};
    private final int[] LEAP_MAX_DAYS={30,29,31,30,31,30,31,31,30,31,30,31};

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
            return LEAP_MAX_DAYS[month -1];
        }else {
            return MAX_DAYS[month -1];
        }

    }
    public void printCalendar(int year,int month,int weekday){
        System.out.printf("         <<%4d년%3d월>>\n",year,month);
        System.out.println("  일  월  화   수  목   금  토");
        System.out.println("-----------------------------");
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
    public static void main(String[] args){

    }

}
