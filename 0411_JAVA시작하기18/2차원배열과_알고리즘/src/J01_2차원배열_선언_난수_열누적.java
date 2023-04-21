/**
 * J01_2차원배열_선언_난수_열누적
 */
import java.util.*;;
public class J01_2차원배열_선언_난수_열누적 {

    public static void main(String[] args) {
        //10~100미만의 정수의 난수를 생성 그리고
        //배열 (열) 값으로 지정 그리고 누적합을 구한다.
        //예시]
        //난수 출력 행과 열로 출력
        //10 26 ... 누적합 
        int[][] arr;
        //입력값을 행수 열수
        int row=4; //화면입력받기
        int col=4; //화면입력받기
        int cnt=0;
        //화면입력받기  행 열
        Scanner sc = new Scanner(System.in);

        System.out.println("행의 수를 입력하세요");
        row=sc.nextInt();
        System.out.println("열의 수를 입력하세요");
        col=sc.nextInt();
    
        
        arr = new int [row][col]; //생성
        //배열이 arr[4][4] - 행과 열이 같으면 정방형 배열!!!
        
        //배열이 arr[4][5] - 행과 열이 다르면 비정방형 배열!!!
        // int[][] arr2={
        //     {1,2,3,4},
        //     {5,6,7},
        //     {200,300,400,500,600}
        // };

        //열의 수가 모두 같다 : 정방형 2차원 배열
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                cnt++;
                arr[i][j]=cnt; //그리고 배열 값을 저장한다.
            }
        }
        
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){ //배열의 열의 수가 불규칙인경우는 반드시 
                cnt++;
                System.out.printf("%4d",arr[i][j]);
             
            }
            System.out.println();
        }

    }
}