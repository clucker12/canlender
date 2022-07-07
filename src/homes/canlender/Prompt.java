package homes.canlender;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT="cal> ";

    public void runPrompt(){
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();//생성자 선언
//        System.out.println("반복횟수를 입력하세요.");
//        int count=scanner.nextInt();
        int month=0;
        int year=0;
        while (month !=-1){
            System.out.println("연도를 입력하세요");
            System.out.print(PROMPT);
            year = scanner.nextInt();
            System.out.println("월을 입력하세요");
            System.out.print(PROMPT);
            month = scanner.nextInt();

            if(month==-1){
                System.out.println("Bye!");
            }else if(month>12){
                continue;
            }else{
                //System.out.printf("%d월은 %d일까지 있습니다.\n", month,cal.maxDaysOfMonth(month));
                cal.printCalendar(year,month);
            }
        }

        //cal.printSempleCalendar();
    }


    public static void main(String[] args){
        //셸 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
