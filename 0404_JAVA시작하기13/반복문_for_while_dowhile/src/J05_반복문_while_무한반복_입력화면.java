import java.util.Scanner;

public class J05_반복문_while_무한반복_입력화면 {
    public static void main(String[] args) {
        //문제
        //화면에서 문자(chr)입력받는다
        //입력문자는 문자형 변수 ch
        //증감정수형 변수는 cnt
        //a를 입력하면 숫자 1증가
        //b를 입력해도 숫자 1증가
        //c를 입력해도 숫자 1증가
        //x를 입력하면 숫자 1감소
        //y를 입력하면 숫자 1감소
        //z를 입력하면 숫자 1감소
        //프로그램 종료는 e입력시 강제종료
        //프로그램 종료시 연산 결과 출력하시오

        int cnt=0;
        Scanner sc= new Scanner(System.in);
        
        
            while(true){
                System.out.println("a|b|c 는 증가 x|y|z는 감소 종료! e");
                char ch=sc.next().charAt(0); //공백전까지
                 if(ch=='a'||ch=='b'||ch=='c'){
                    cnt++;
                    
                 }
                 else if(ch=='x'||ch=='y'||ch=='z'){
                    cnt--;
                    
                 }
                 else if(ch=='e'){
                    System.out.println("프로그램을 종료합니당");
                    break;
                 }

                 System.out.println("연산결과는 : " + cnt);

            }   

        


    }
}
