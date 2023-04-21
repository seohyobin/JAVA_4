import java.util.Scanner;

/*
 * 배열(Array)
 *같은 자료형이 여러개 데이터를 묶어서 저장하는 공간
  배열의 저장공간은 배열 인덱스번호 시작이 0부터 ~ 순서를 갖는다.
  처음 생성(생성자방식 new )할 때 배열의 크기를 정해야하며 
  한번 크기를 정하면 변경할 수 없다.
 **
 배열의 선언 방법
    1.데이터 목록으로 배열을 생성하기
        자료형 [] 변수명 = {데이터1,데이터2,데이터3...} 

 */
public class J03_배열_일차원배열 {
    public static void main(String[] args) {
        //1.배열선언
        //데이터 목록으로 배열을 생성하기
        //자료형 [] 배열 변수명 = {데이터1,데이터2,데이터3...} 

        System.out.println("====배열 선언과 생성하기====");
        //1차원배열에 정수데이터 10, 20, 30, 40, 50=> 5개를 저장하기

        int[] arr = {10, 20, 30, 40, 50}; //리터럴 방식
        
        //출력하기 
        //1차원 배열값 출력하기
        System.out.println("====배열 출력 하기 배열 인덱스 번호 사용====");
        System.out.println("첫번째 배열 [0] " + arr[0]);
        System.out.println("첫번째 배열 [1] " + arr[1]);
        System.out.println("첫번째 배열 [2] " + arr[2]);
        System.out.println("첫번째 배열 [3] " + arr[3]);
        System.out.println("첫번째 배열 [4] " + arr[4]);

        //1차원 배열값 출력하기 => 반복문 활용
        System.out.println("====배열 출력 인덱스 번호 =>반복문 활용====");
        for(int i=0; i<5; i++ ){ //i는 인덱스번호
            
            System.out.println("배열["+ i + "] " + arr[i]);
        }
        System.out.println();

        //2.배열 데이터 변경하기
        arr[0] = 200; //10 첫번째 배열값 10을 200으로 변경한다.
        arr[1] = 300; //20=>300
        arr[2] = 400;
        arr[3] = 500;
        arr[4] = 600;
        //1차원 배열값 출력하기 => 반복문 활용
        //arr.length; 배열의 길이 =>5
        System.out.println("====수정 후 변경된 배열 출력=>반복문 활용====");
        for(int i=0; i<arr.length; i++ ){ //i는 인덱스번호
            
            System.out.println("배열["+ i + "] " + arr[i]);
        }
        System.out.println();


        //3.배열 선언만 하고 나중에 데이터를 넣는 방법
        int[] arr2;
        //1-1] 선언된 배열에 데이터 넣기
        //arr2={100,200,300,400,500};//오류발생

        //1-2] 선언된 배열에 데이터 넣기
        arr2= new int[] {1,2,3,4,5}; 
        System.out.println("====배열 선언 후 나중에 데이터 넣기=>반복문 활용====");
        for(int i=0; i<arr2.length; i++ ){ //i는 인덱스번호
            
            System.out.println("배열["+ i + "] " + arr2[i]);
        }
        System.out.println();
   
        //4.배열 생성하기 5개 그리고 나중에 
        int[] arr3=new int[5]; //정수형 1차원 배열 저장공간 (원소갯수) 5개를 생성한다.

        //배열 데이터 값 넣기
        arr3[0]=1000;//1000*1
        arr3[1]=2000;//1000*2
        arr3[2]=3000;//1000*3
        // arr3[3]=4000;//1000*4
        // arr3[4]=5000;//1000*5
        ////정수로 선언해서 값이 없어도 빈 배열에 0 으로 출력 가능
        System.out.println("====배열 선언 후 나중에 데이터 넣기=>반복문 활용====");
        for(int i=0; i<arr3.length; i++ ){ //i는 인덱스번호
            
            System.out.println("배열["+ i + "] " + arr3[i]);
        }
        System.out.println();

        //5.배열 화면 입력 받기

        System.out.println();
        System.out.println("====배열 화면 입력 받기====");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        //System.out.println("배열 데이터 입력 : ");
        int[] arr4 = new int[3]; //배열 저장 공간 장소 3개 (배열 원소가 3개)
        for(int i=0; i<arr4.length; i++) {
            System.out.println("배열 데이터 입력: ");
            arr4[i]=sc.nextInt();

        }
        
        System.out.println();
        System.out.println("====입력 받은 데이터 출력하기====");
        System.out.println();

         for(int i=0; i<arr4.length; i++ ){
            System.out.println("arr4 [" + i +"]=" + arr4[i]);
         }
    }   
}
