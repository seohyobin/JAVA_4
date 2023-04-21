import java.util.*;
public class J04_반복문_시작_종료값 {
    
    public static void main(String[] args) {
        //0.변수선언
        int s=0;
        int e=0; 
        int sum=0; //누적변수는 반드시 초기값이 있어야한다.

        //시작 정수  입력
        //종료 정수  입력

        //1.input
        Scanner sc = new Scanner(System.in);
        System.out.println("시작값 입력:");
        s =sc.nextInt();
        System.out.println("종료값 입력:");
        e =sc.nextInt(); 

        //3.process
        //문제1] 시작~종료까지의 합 ->누적합
        for(int i=s; i<=e; i++ ){
            sum+=i;//sum = sum + i; //알고리즘 표현법
        }

        //2.output
        //System.out.printf("시작값:%d 종료값:%d 누적합:%d \n", s ,e ,sum);
        System.out.println("시작~종료=>누적합//////////////////////////////////");
        System.out.println(String.format("시작값:%d 종료값:%d 누적합:%d", s ,e ,sum));


        //문제2] 시작~종료 4배수 합 구하기
        sum=0; //누적변수 초기화!!! i는 새로운값이라서 괜찮아!!! 
        for(int i=s; i<=e; i++ ){
            if(i%4==0){
                sum+=i;
            }
        }

        //2.output
        //System.out.printf("시작값:%d 종료값:%d 누적합:%d \n", s ,e ,sum);
        System.out.println("4의배수 시작~종료=>누적합//////////////////////////////////");
        System.out.println(String.format("시작값:%d 종료값:%d 누적합:%d", s ,e ,sum));
        

        





    }   
}
