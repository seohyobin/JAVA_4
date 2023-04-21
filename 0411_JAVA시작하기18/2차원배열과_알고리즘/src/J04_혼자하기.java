import java.util.Scanner;

/**
 * J04_혼자하기
 */
public class J04_혼자하기 {

    public static void main(String[] args) {
        int [][] arr;
        int row=0;
        int col=0;
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("행 입력 : ");
            row=sc.nextInt();

            if(row<1 || row>10){
                System.out.println("행은 1~10사이로 입력하세요");
            }
            else{
                while(true){
                System.out.println("열 입력 : ");
                col=sc.nextInt();
              
                if(col<1 || col>10){
                    System.out.println("열은 1~10사이로 입력하세요");
                    
                }
                else{
                    arr= new int [row][col]; 
                    
                    for(int i =0; i<arr.length; i++){
                        for(int j=0; j<arr[i].length; j++){
                            arr[i][j]=(int)(Math.random()*26+97);
                        }
                        System.out.println();
                    }

                    for(int i =0; i<arr.length; i++){
                        for(int j=0; j<arr[i].length; j++){
                            System.out.printf("%3c" ,(char)arr[i][j] );
                        }
                        System.out.println();
                    }
                    System.out.println();
                        break;
                    }
                }
                    break;
            }
            
        }
        
    }
}