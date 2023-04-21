import java.util.Scanner;

public class J01_혼자하기 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s= 0;
        int e= 0;
        int [][] arr;

        while(true){
            System.out.println("시작단을 입력하세요 : ");
            s=sc.nextInt();
            if(s<2 || s>9){
                System.out.println("1 ~ 9 까지만 입력가능합니다.");
            }
            else{
                while(true){ 
                System.out.println("종료단을 입력하세요 : ");
                e=sc.nextInt();
                if(e<2 || e>9 ||s>e){
                    System.out.println("1 ~ 9 까지, 시작단보다 큰 수만 입력가능합니다.");
                }
                else{
                    arr=new int[9][s-e+1];

                    for(int i=1; i<9; i++){
                    int col = -1;
                        for(int j =s; j<=e; j++){
                            col++;
                            arr[i-1][col] = j*i;
                            System.out.printf("%d*%d=%2d  ", j, i, j*i);
                        }
                    System.out.println();
                    }

                    for(int i=0; i<arr.length; i++){
                        for(int j=0; j<arr[i].length; j++){
                            System.out.printf("%2d ", arr[i][j]);
                           
                        }
                        System.out.println();
                    }
                    break;

                }

              
                }
            break;
            }
        }

    }
}
