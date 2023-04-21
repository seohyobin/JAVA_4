public class J02_2차원배열값증가와출력 {
    public static void main(String[] args) {
        // 2차원 배열 생성과 값 증가 출력
        // 문제1] 
        // 1. 2차원 5행 5열 배열 생성
        // 2. 2차원 배열에 행열에 1씩증가 값을 넣어 출력 하시오.
        // 3. 증가변수는 정수형 cnt
                
        // [1] 입력 설계  2차원 5행 5열
        int[][] arr = new int[5][5];
        int cnt = 0;


        // [3] 처리 설계
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){   
                //cnt++;             
                arr[i][j] = ++cnt;//전위연산 먼저 증가하고 배열에 값을 대입한다/
                // cnt++후위연산(값을 넣어주고 그리고 중거)++cnt=>0 1 2 3....24
            }
        }        

        // [2-1] 출력 설계 오름차순
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){   
                
                if(j==0){
                    System.out.printf("%2d ",  arr[i][j]);
                }
                else{
                    System.out.printf("%4d ",  arr[i][j]);
                }
                
                
            }
            System.out.println();
            System.out.println();
        }
        // [2-0] 출력 설계 내림차순
        
        for(int i=arr.length-1; i>=0; i--){
            for(int j=arr[i].length-1;j>=0; j--){   
                // [i][j]
                // [4][4] [4][3]....
                
                if(j==4){ //4가 첫번째 칸
                    System.out.printf("%2d ",  arr[i][j]);
                }
                else{
                    System.out.printf("%4d ",  arr[i][j]);
                }
                
                
            }
            System.out.println();
            /*
            행열 역순
            [4][4] [4][3] [4][2] [4][1] [4][0]
            [3][4] [3][3] [3][2] [3][1] [3][0]
            [2][4] [2][3] [2][2] [2][1] [2][0]
            [1][4] [1][3] [1][2] [1][1] [1][0]
            [0][4] [0][3] [0][2] [0][1] [0][0]

             25 24 23 22 21
             20 19 18 17 16
             15 14 13 12 11
             10  9  8  7  6
              5  4  3  2  1
              
             */
        }







    }
}
