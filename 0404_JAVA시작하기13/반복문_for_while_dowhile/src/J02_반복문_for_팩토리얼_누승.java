import java.util.Scanner;

public class J02_반복문_for_팩토리얼_누승 {
    public static void main(String[] args) {
        //5팩토리얼 구하기
        //5! = 1*2*3*4*5
        //=120
        //곱한 결과를 누적한다. 누승!
    

        //1.입력설계
        int num =5 ;
        int sum =1;

        //화면입력 받아서 팩토리얼 구하기

        Scanner sc= new Scanner(System.in);
        System.out.println("! 팩토리얼 정수로 입력 : ");
        num=sc.nextInt();

        //3.처리문

        for(int i=num; i>=1; i--){
             System.out.print(i);
            if(i!=1){
                System.out.print("×");
            }
           
           sum*=i;
        }

        //2.출력설계
        System.out.println();
        System.out.println("3! 팩토리얼 누적합= " + sum);
        System.out.println();



        int z=7;
        int summ=1;

        for(int k=z; z>=1; z--){
            summ*=k;
        }

        System.out.println("7! 팩토리얼 누적합=" + summ);
    }   
}
