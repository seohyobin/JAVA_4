import java.util.Scanner;

/**
 * J02_반복분_윤년구하기
 */
public class J02_반복분_윤년구하기 {

    public static void main(String[] args) {


        for(int year = 1900; year<2900; year+=1){
            if (( year%4==0 && year%100!=0) || (year%400==0)){
                System.out.println(year + "년도는 윤년입니다");
            }

        }

    }
}