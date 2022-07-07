package homes.canlender;

import java.util.Scanner;

public class Calendar {
    private final int[] MAX_DAYS={30,28,31,30,31,30,31,31,30,31,30,31};
    public int maxDaysOfMonth(int month){
        return MAX_DAYS[month -1];
    }
    public void printSempleCalendar(){
        System.out.println("일  월 화  수 목 금 토");
        System.out.println("-------------------");
        System.out.println(" 1  2  3  4  5  6  7 ");
        System.out.println(" 8  9 10 11 12 13 14 ");
        System.out.println("15 16 17 18 19 20 21 ");
        System.out.println("22 23 24 25 26 27 28 ");
    }
    public static void main(String[] args){

        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

        String PROMPT="cal> ";
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();//생성자 선언
//        System.out.println("반복횟수를 입력하세요.");
//        int count=scanner.nextInt();
        int month=0;
        while (month !=-1){
            System.out.println("월을 입력하세요");
            System.out.print(PROMPT);
            month = scanner.nextInt();

            if(month==-1){
                System.out.println("Have a nice day!");
            }else if(month>12){
                continue;
            }else{
                System.out.printf("%d월은 %d일까지 있습니다.\n", month,cal.maxDaysOfMonth(month));
            }
        }

        cal.printSempleCalendar();
    }

}
