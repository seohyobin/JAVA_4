
public class J03_method_응용 {

    //1. 리턴값 X , 매개변수 X  method
    //ex] "안녕하세용" 문자열 5번 출력하는 매소드를 만들고 실행하세요
    //static 이 없는 매소드는 실행할 수 없다.
    //단 클래스 생성자를 만들어서 매소드 호출 실행 가능하다
    // 생성자이름 . hello();
    static void hello(){
        for(int i= 0; i <5; i++){
            System.out.println( i+1 + " 안녕하세용");
        }
    }

    //2.리턴값 X(void) , 매개변수2개 method   
    //매개값 문자열과 숫자를 입력받고 
    //받은 숫자는 숫자의 횟수만큼 문자열 내용 반복 출력하는 매소드 작성하고 실행하세용
    //repeatStr  매개변수  문자열 str 숫자 num 사용
 
    

    public static void repeatStr(String str, int num ) {
        for(int i=0; i<num; i++){
         System.out.println(str);
        }
    }

    //3.리턴 O , 매개변수 O ->정수
    //문제]3개의 숫자를 입력받고 평균값을 리턴해!!!
    // avg  a b c  
     static double avg (int a, int b, int c) {
        return (a + b + c)/3.0;
    }

    //4.리턴X , 매개변수 O 매서드
    //문제2] 매개변수가 1차원 배열 
    //매개변수 받아서 배열을 반복문 사용 출력 하는 매소드 작성하고 실행하세요~
    //매소드 이름은  arrMethod1 매개변수는 배열은 정수형 1차원 배열 변수 사용 arr
    public static void arrMethod1(int arr[]){
        
        for(int i = 0; i<arr.length; i++){
            System.out.printf("%2d",arr[i]);
        }
        System.out.println();

    }


    //5.리턴X , 매개변수 O 매서드
    //문제3] 매개변수가 2차원 배열 
    //매개변수 받아서 배열을 반복문 사용 출력 하는 매소드 작성하고 실행하세요~
    //매소드 이름은  arrMethod2 매개변수는 배열은 정수형 1차원 배열 변수 사용 arr
    static void arrMethod2(int arr1[][]){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.printf("%3d "  ,arr1[i][j] );
            }
            System.out.println();
        }
    }


    //6.리턴O , 매개변수 O 매서드
    //문제3] 매개변수가 2차원 배열 
    //매개변수 받아서 배열을 반복문 사용 출력 하는 매소드 작성하고 실행하세요~
    //매소드 이름은  arrMethod3 매개변수는 배열은 정수형 1차원 배열 변수 사용 arr
    static int arrMethod3(int arr2[][]){
        int sum=0;
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                sum+=arr2[i][j];
            }
          
        }
        return sum; 
    }



    
    public static void main(String[] args) {

        J03_method_응용 newJ03_method_응용 = new J03_method_응용(); // class 생성자
        //J03_method_응용 newArr= new J03_method_응용();

        //static 없으면 반드시 클래스 생성자를 만들어서 실행 가능

        //1. 리턴값 X , 매개변수 X  method =>method 호출
        System.out.println();
        hello(); 
        //static 키워드 없으면 오류=> 마우스 오버시 빠른수정 => 자동으로 static 추가되어 오류 수정
        //newJ03_method_응용.hello(); //static 키워드가 없는 경우 사용 방법
        System.out.println(); 

        //2. 리턴값 X , 매개변수 2개  method =>method 호출
        //static void repeatStr(String str, int num )
        repeatStr("TGF",5);
        System.out.println();
        //3.리턴 O , 매개변수 O ->정수
        double result = avg(77 ,90 ,100);
        System.out.println("평균: "+ result);
        System.out.println();
        
        //4.1차원배열 
        //배열 선언과 생성하여 전달
        //매소드 호출  전달 실행
       
        int [] arr ={1,2,3,4,5};
        arrMethod1(arr);
 

        //5.2차원배열 
        //배열 선언과 생성하여 전달
        //매소드 호출  전달 실행
        int [][] arr1 ={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,15,16}
        };
        arrMethod2(arr1);

        System.out.println();
        System.out.println("배열 합"+ arrMethod3(arr1) );
        System.out.println();

        int [][] arr2 ={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,15,16}
        };
        arrMethod2();



        






    }

}
