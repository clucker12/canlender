package homes.canlender;

import java.util.Scanner;

public class Prompt {

    public int parseDay(String week){
        if(week.equals("일"))
            return 0;
        else if(week.equals("월"))
            return 1;
        else if(week.equals("화"))
            return 2;
        else if(week.equals("수"))
            return 3;
        else if(week.equals("목"))
            return 4;
        else if(week.equals("금"))
            return 5;
        else if(week.equals("토"))
            return 6;
        else
            return 0;
    }
    public void runPrompt(){
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();//생성자 선언
//        System.out.println("반복횟수를 입력하세요.");
//        int count=scanner.nextInt();
        int month=1;
        int year=0;

        while (true){
            System.out.println("년도를 입력하세요. (exit : -1)");
            System.out.print("YEAR> ");
            year = scanner.nextInt();
            if (year == -1)
                break;
            System.out.println("월을 입력하세요");
            System.out.print("MONTH> ");
            month = scanner.nextInt();

            if(month>12 || month <1){
                System.out.println("잘못된 입력입니다!");
                continue;
            }
//            else{
//                //System.out.printf("%d월은 %d일까지 있습니다.\n", month,cal.maxDaysOfMonth(month))
//            }
            cal.printCalendar(year,month);
        }
        System.out.println("Bye!");
        //cal.printSempleCalendar();
    }


    public static void main(String[] args){
        //셸 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
