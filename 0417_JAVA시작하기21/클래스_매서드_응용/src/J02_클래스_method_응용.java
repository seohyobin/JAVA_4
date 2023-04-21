import java.util.Scanner;

public class J02_클래스_method_응용 {

    //1.매소드 제작
   public void method1(int cnt){

   


        for(int i=0; i<cnt; i++){
            System.out.println("자바!!!!");
        }

   }

    public static void main(String[] args) {
        // 출력할 횟수를 정수로 화면에서 입력
        // 그리고 매소드는 static 키워드,return 값이 없는 매서드를 생성하고 호출 실행 하시오.

        //2.호출실행
    
        J02_클래스_method_응용 newJ02_클래스_method_응용  =new J02_클래스_method_응용();
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        cnt=sc.nextInt();

        newJ02_클래스_method_응용.method1(cnt);

    


        

    }
}
