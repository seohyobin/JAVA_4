import java.util.Scanner;

/**
 * J02_
 */
public class J02_ {

    public void method1( int cnt) {
        for(int i=0; i<cnt; i++){
            System.out.println("자바!!!");

        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cnt = 0;
        System.out.println("숫자를 입력하세요");
        cnt=sc.nextInt();
  
        
        J02_ newJ02_=new J02_(); 
        newJ02_.method1(cnt);

    }
}