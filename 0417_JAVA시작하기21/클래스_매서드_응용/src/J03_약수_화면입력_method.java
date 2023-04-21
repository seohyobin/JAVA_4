import java.util.Scanner;

public class J03_약수_화면입력_method {

    static void method1(int cnt){
        System.out.println();
        for(int i=1; i<=cnt; i++){
            if(cnt%i==0){
                System.out.println(i);
            }

         
        }
        System.out.println();

    }


    public static void main(String[] args) {
        //정수를 화면입력 받아서 약수를 구하시오
        //단 리턴문 없는 매소드를 호출 실행한다.


        Scanner sc= new Scanner(System.in);
        int cnt=0;
        System.out.println("정수를 입력하세요");
        cnt=sc.nextInt();

        //매소드 호출
        method1(cnt);


        //ex]
        //10의 약수 
        //1 2 5 10 나누어 떨어지는 수
        //8의 약수
        //1 2 4 8



        

    }
}
