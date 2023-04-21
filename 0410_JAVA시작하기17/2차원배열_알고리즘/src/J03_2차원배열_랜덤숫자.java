public class J03_2차원배열_랜덤숫자 {
    public static void main(String[] args) {
        //임의 숫자 (random number)를 증가시켜서 정수로 저장
        //Math.random()*10+1; =>0보다 크고 10 보다 작은 임의의 실수가 출력
        //arr[i][j]=(int)(Math.random()*10+1);
        //cnt 
        //5행 5열
        int arr [][] = new int [5][5];


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){   
                //cnt++;             
                arr[i][j]=(int)(Math.random()*10+1);//전위연산 먼저 증가하고 배열에 값을 대입한다/
                // cnt++후위연산(값을 넣어주고 그리고 중거)++cnt=>0 1 2 3....24
            }
        } 


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
        }

        //arr[i][j]=(int)(Math.random()*10+1);
        //1.  입력설계
        
        //3.  처리설계
        //2.  출력설계 : 숫자 4자리 오른족 정렬(첫칸은 공백없음)
    }
}
