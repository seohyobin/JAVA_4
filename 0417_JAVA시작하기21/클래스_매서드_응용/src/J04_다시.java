import java.util.Scanner;

public class J04_다시 {

    public static boolean prime (int num){
        boolean boo=true;
            if(num==1){
                boo= false;
            }
            for(int i=2; i<num; i++){
                if(num%i==0){
                    boo=false;
                }
            }
            return boo;
        }

    

    

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("정수를 입력하세영");
    int num=sc.nextInt();
    for(int i=2; i<=num; i++){
        if(prime(i)==true){
            System.out.print(i+"  ");
        }
    }

        
    }   
}
