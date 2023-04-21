import java.util.Scanner;

/**
 * J01_선택_사칙연산_매소드
 */
public class J01_선택_사칙연산_매소드 {

    public static int addMethod(int num1, int num2){
        
        return num1 + num2;
    }
    public static int subMethod(int num1, int num2){

        return num1 - num2;
    }
    public static int mulMethod(int num1, int num2){

        return num1 * num2;
    }
    public static double divMethod(double num1, double num2){

        return num1/num2;
    }

    public static void main(String[] args) {
        //프로젝트 : 4칙연산 매소드 구현 =>  1+   2-   3/   4×
        //입력화면에서 : 1번 선택하면 + 메서드로 이동 연산결과를 리턴 값으로 받는다.
        //선택 조건문은 switch(){}
        //메서드 이름은  
        //1 + : addMethod   
        //2 - : subMethod   
        //3 / : mulMethod   
        //4 * : divMethod
        //모든 메서드는 리턴값이 있는 메서드로 제작
        //연산 매개변수는 2개로 한다 num1 num2

        //예시]
        //입력설계
        //정수 1 입력 :5
        //정수 2 입력 :10
        //연산 종류를 선택하세요 1.+ 2.- 3.* 4./
        //입력 리턴 정수1 정수2  연산결과 15

        


        Scanner sc = new Scanner(System.in);
   
        System.out.println("첫번째 정수를 입력하세요");
        int num1=sc.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        int num2=sc.nextInt();
        System.out.println("사칙연산을 입력하세요 1.+ 2.- 3.* 4./");
        int n=sc.nextInt();
        

        switch(n){

            case 1: 
            System.out.println("+ 덧셈 정답은:" + addMethod(num1, num2));
            break;

            case 2: 
            System.out.println("- 뺄셈 정답은:" + subMethod(num1, num2));
            break;

            case 3: 
            System.out.println("* 곱하기 정답은:" + mulMethod(num1, num2));
            break;

            case 4: 
            System.out.println("/ 나누기 정답은:" + divMethod(num1, num2));
            break;

            default:
            System.out.println("알맞은 사칙연산을 입력하세요 1.+ 2.- 3.* 4./");
            break;

        }
        sc.close();

    }
}