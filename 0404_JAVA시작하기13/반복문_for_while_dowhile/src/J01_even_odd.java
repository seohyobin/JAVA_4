/**
 * J01_even_odd
 */
import java.util.Scanner;
public class J01_even_odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //문제1]
        //1부터 100까지 짝수와 홀수의 합계 출력
        //반복문->for(){} 사용 구현하시오!!!

        //1.입력 : 변수 자료형 지정
        int i =1; //1~100까지 증가 변수
        int even;
        int odd;
        int even_sum=0; //누적합의 변수는 반드시 초기값을 지정해야한다.
        int odd_sum=0;       

        //3.처리 : 1~100까지의 정수를 2로 나누어서 나머지가 0 짝수 아니면 홀수
        for( i=1; i<=100; i++){
            if(i%2==0){//even
                even_sum+=i;
            }
            else{
                odd_sum+=i;
            }
        }
      
        //2.출력 : 구문 
        System.out.println("짝수의 합은= " + even_sum);
        System.out.println("홀수의 합은= " + odd_sum);



        int num = 1;
        int ev_sum =0; 
        int od_sum =0;

        for(num=1; num<=120; num++ ){
            if(num%2==0){
                ev_sum+=num;
            }
            else{
                od_sum+=num;
            }
        }
        
        System.out.println("짝수합은" + ev_sum);
        System.out.println("홀수합은" + od_sum);

        

    }
}