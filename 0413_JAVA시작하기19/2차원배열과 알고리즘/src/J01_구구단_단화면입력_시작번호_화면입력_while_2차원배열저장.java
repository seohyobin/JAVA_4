import java.util.Scanner;

/**
 * J01_구구단_단화면입력_시작번호_화면입력_while_2차원배열저장
 */
public class J01_구구단_단화면입력_시작번호_화면입력_while_2차원배열저장 {

    public static void main(String[] args) {
        //문제1] 2차원배열에 구구단을 저장 출력
        //1.화면에서 구구단 단을 입력 받는다 .
        //2.단 2단~9단까지 입력제한조건( 시작단, 끝단  )
        //3.행수는 1부터 9까지 기본 반복 실행
        //4.2차원 배열에 저장
        //5.출력 실행 2 ㄷ 한자 × 1 = 2
        //예] 구구단 시작단을 입력하세요 2
        //예] 구구단 종료단을 입력하세요 7
        //2*1= 2 3*1=3...9*1=9
        //2*9=18 ...

        //입력설계
        
        //int[][] arr;

        Scanner sc = new Scanner(System.in);

  
        int cnt=0;
        int[][] arr;
        int sum = 0;
        

        //처리설계

        while(true){
            System.out.println("구구단 시작단을 입력하세요");
            int start = sc.nextInt();
            if(start<1 || start>9){ 
                System.out.println("1~9까지 사이의 수를 입력하세요");
            }
            else{
                System.out.println("구구단 종료단을 입력하세요");
                int end = sc.nextInt();
                while(true){
                    if(end<1 || end>9){
                        System.out.println("1~9까지 사이의 수를 입력하세요");
                    }
                    else{
                        for( ;start<=end; start++){
                            for(int i=1; i<=9; i++){
                                System.out.println(start + " * " + i +  " = " + (start*i));
                               
                            }
                            System.out.println();
                           
                        }

                        break;
                    }
                }

                break;
            }

        }








        //출력설계
       
        // System.out.printf("%d × %d" , start,cnt);

        

    }
}