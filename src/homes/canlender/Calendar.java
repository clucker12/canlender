package homes.canlender;

import java.util.Scanner;

public class Calendar {
    private final int[] MAX_DAYS={30,28,31,30,31,30,31,31,30,31,30,31};
    public int maxDaysOfMonth(int month){
        return MAX_DAYS[month -1];
    }
    public void printSempleCalendar(int month){
        System.out.println("  일  월  화   수  목   금  토");
        System.out.println("-----------------------------");
        for(int i=1;i<=maxDaysOfMonth(month);i++){
            if(i%7==0){
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
