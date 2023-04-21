public class J02_2차원배열_비정방형 {
    public static void main(String[] args) {
        //  정방형 2차원 배열: 열의 수가 행마다 같은것
        //비정방형 2차원 배열: 열의 수가 행마다 다른것

        //비정방형 선언과 생성
       
        int[][] arr={
            {21,22,546,78},
            {1,2,3},
            {100,200,300,400,500,600,700,800,900},
            {12,478,565,77,895}
        };
        int[] sum =new int [arr.length];

        sum[0] = 0;
        sum[1] = 0;
        sum[2] = 0;
        sum[3] = 0;
        System.out.println("==============================배열 누적 ");
            System.out.println();
        for(int i=0; i<arr.length; i++){ //행 => 줄 row

            for(int j=0; j<arr[i].length; j++){ //열 => 칸 col
                sum[i]+=arr[i][j]; //sum[0] = 누적값 sum[1]= 누적값.../.
                System.out.printf("%5d", arr[i][j]);
            }
            //칸이 끝나면 마지막 칸에 출력

            System.out.printf("%4d", sum[i]);
            System.out.println();
        }
        System.out.println();

        //2차원 배열 선언과 생성방식

        int[][] arr1 = new int[4][]; //줄 번호만 명시/ 행만 생성한다.

        //각 행마다 열(칸)만생성한다.
        arr1[0] = new int[4];
        arr1[1] = new int[3];
        arr1[2] = new int[9];
        arr1[3] = new int[5];
         int cnt=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                cnt++;
                arr1[i][j] = cnt;
            }
        }
        System.out.println();

        for(int i=0; i<arr1.length; i++){ //행 => 줄 row
            sum[i]=0;
            for(int j=0; j<arr1[i].length; j++){ //열 => 칸 col
                sum[i]+=arr1[i][j];
                System.out.printf("%3d", arr1[i][j]);
            }
            System.out.printf("%5d",sum[i]);
            System.out.println();
        }
        System.out.println();

/////////////////////////////////혼자 연습!!/////////////////
        int [][] arr2 = new int [5][];
        int cnt1=0; 

        arr2[0]=new int[5] ;
        arr2[1]=new int[3] ;
        arr2[2]=new int[7] ;
        arr2[3]=new int[10] ;
        arr2[4]=new int[8] ;

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                //arr2[i][j]=(int)(Math.random()*100+10);
                arr2[i][j]=(int)(Math.random()*10+1);
            }
        }
        System.out.println();
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.printf("%3d", arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //////////////////////////////////////////////////////

    }
}
