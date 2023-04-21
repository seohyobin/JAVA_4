import java.util.Scanner;

public class J04_소수 {

    //소수를 구현하세요~
    //1보다 큰 자연수 1과 자신만을 약수고 가지는 수
    //2 3 5 7 11 13 17 19 23 29 31 37...
    //리턴값있는 매소그
    //리턴값은 boolean =>true false
    //리턴값은 boolean =>true출력 false안함 

    public static boolean prime (int num){

        boolean boo= true;

        if(num==1){
            boo=false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                boo=false;
            }
        }
 
        return boo;
    }


    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            if(prime(i)==true){ //소수이면 return 값 true
                System.out.print(i + "  ");

            }
        }
    
     
        
    
      
    }
}