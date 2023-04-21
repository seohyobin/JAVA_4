import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * J01_StringFormat
 */
//import java.util.*;
public class J01_StringFormat {

    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);

        //1.문자열
        // String str1 = "Java programming";
        // String str2 = "JSP";
        // String str3 = "React.js";
        // String str4 = "Node.js";
        // String str5 = "HTML5";
        // String str6 = "CSS3";
        // String str7 = "SASS";
        // String str8 = "Vue.js";
        // String str9 = "spring";
    
    //오른쪽 정렬 출력
    // System.out.println(String.format("%s IDE 이클립스와 VS CODE, 인텔리제이", str1) );
    // System.out.println(String.format("%s", str2) );
    // System.out.println(String.format("%s", str3) );
    // System.out.println(String.format("%s", str4) );
    // System.out.println(String.format("%s", str5) );
    // System.out.println(String.format("%s", str6) );
    // System.out.println(String.format("%s", str7) );
    // System.out.println(String.format("%s", str8) );
    // System.out.println(String.format("%s", str9) );
    
    // System.out.println(String.format("%20s", str1) );
    // System.out.println(String.format("%20s", str2) );
    // System.out.println(String.format("%20s", str3) );
    // System.out.println(String.format("%20s", str4) );
    // System.out.println(String.format("%20s", str5) );
    // System.out.println(String.format("%20s", str6) );
    // System.out.println(String.format("%20s", str7) );
    // System.out.println(String.format("%20s", str8) );
    // System.out.println(String.format("%20s", str9) );

        //2.실수형
        // double num_d=123.456789;
        // double num_d1=123.456;
        // double num_d2=3.4;
        // double num_d3=45123.1;
        // double num_d4=3123.1545454;

        // System.out.println(num_d);
        // System.out.println(String.format("%f",3.41533));
        // System.out.println(String.format("%f_",3.41533));
        // System.out.println(String.format("%f_부동소수점형식",num_d));
        // System.out.println(String.format("%3.3f",num_d));
        // System.out.println(String.format("%3.2f",num_d1));
        // System.out.println(String.format("%3.1f",num_d2));
        // System.out.println(String.format("%3.7f",num_d3));
        // System.out.println(String.format("%3.6f",num_d4));

        // System.out.println("///////////////////////////////");
        // System.out.println(String.format("%-5.2f",num_d1));
        // System.out.println(String.format("%-5.1f",num_d2));
        // System.out.println(String.format("%-5.7f",num_d3));
        // System.out.println(String.format("%-5.6f",num_d4));

        // System.out.println("///////////////////////////////");
        // System.out.println(String.format("%05.2f",num_d1));
        // System.out.println(String.format("%05.1f",num_d2));
        // System.out.println(String.format("%05.7f",num_d3));
        // System.out.println(String.format("%05.6f",num_d4));


        //금액표기

        // long money = 35000000;

        // System.out.println("//////금액표시//////");
        // System.out.println(String.format("%d" , money));
        // System.out.println(String.format("%d원" , money));
        // System.out.println(String.format("%,d원" , money));
        // System.out.println(String.format("￦ %d원" , money));
        // System.out.println(String.format("￦ %,d원" , money));


        Calendar cal = Calendar.getInstance();


    
        // System.out.println("///////////Calendar.getInstance();//////////////");
        // System.out.println(String.format("%tp",cal));


        // cal.set(2023, 03, 03); //월은 0부터11까지 시작 +1
        // System.out.println(String.format("Calendar 년-월-일 %tF",cal));
        // System.out.println(String.format("Calendar 년 %tY",cal));
        // System.out.println(String.format("Calendar 년 %ty",cal));
        // System.out.println(String.format("Calendar 월 %tm",cal));
        // System.out.println(String.format("Calendar 일 %td",cal));

        Date today = new Date(cal.getTimeInMillis());
        // System.out.println("///////날짜객체new Date(cal.getTimeInMillis());////////");
        // System.out.println(String.format("1900년부터 오늘까지 날짜 날수 타임 밀리초: %d",cal.getTimeInMillis()));
        // System.out.println(String.format("Date 년-월-일 %tF",today));
        // System.out.println(String.format("Date 년 %tY",today));
        // System.out.println(String.format("Date 년 %ty",today));
        // System.out.println(String.format("Date 월 %tm",today));
        // System.out.println(String.format("Date 일 %td",today));
        // System.out.println(String.format("Date요일%tA",today));
        // System.out.println(String.format("Date 시 %tH",today));
        // System.out.println(String.format("Date 분 %tM",today));
        // System.out.println(String.format("Date 초 %tS",today));


        //윤 4년 
        //년도 기준 1900년
        //4년 주기 : 4로 나누어 나머지가 0이고 
        //100으로 나누어 나머지가 0이아니면 윤년
        //또는 
        //400으로 나누어 나머지가 0이면 윤년
        Scanner sc= new Scanner(System.in);
        int year = 2023;
        System.out.println("년도를 입력하세요");
        year=sc.nextInt();
    

        if (( year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year + "년도는");
            System.out.println("윤년입니다");
        }
        else{
            System.out.println(year + "년도는");
            System.out.println("평년입니다.");
        }


      

    }
}