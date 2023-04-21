public class J02_method2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        Method1();
        Method2("서효빈");
        System.out.println();
        Method3(3,5);
        System.out.println();
        System.out.println("리턴값이 있는 매소드 호출 값  " + Method4(5,8));
        int result = Method4(9, 6);
        System.out.println();
        System.out.println("리턴값이 있는 매개변수 2개 매소드 변수에 호출  값  " + result);
        System.out.println();
        result = Method5(3, 9, 7 );
        System.out.println("리턴값이 있는 매개변수 3개 매소드 변수에 호출  값  " + result);
        result = Method5(3, 9, 7 );
        System.out.println("리턴값이 있는 매개변수 3개 매소드 변수에 호출  값  " + result);

        result = Method5(100, 2, 3 );
        System.out.println("리턴값이 있는  오버로딩 결과  " + result);

        result = Method5(25, 8, 6 );
        System.out.println("리턴값이 있는  오버로딩 결과  " + result);

        result = Method5(10, 65, 2 );
        System.out.println("리턴값이 있는  오버로딩 결과  " + result);
        //리턴값이 문자열 
        String resultStr = Method5("오버로딩 " , "매개변수2개");
        System.out.println("리턴값이 있는 문자열  " + resultStr);


        result = Method5(100, 200, 300 );

        System.out.println("리턴값이 있는 매개변수 3개 매소드 변수에 호출  값  " + result);

    }

    //1.기본 매소드 : 리턴값이 없는 매소드 void
    //  기본 매소드 : 매개변수 없는 매소드()

    public static void Method1() {
        System.out.println("여기는 기본 매소드 입니댜!!!!!!!!!!!!");
    }
    //2.void 매소드 : 리턴값이 없는 매소드 void
    //              : 매개변수 없는 매소드(매개변수)

    public static void Method2(String name) {
        System.out.println("리턴값이 없고  매개변수 있는 매소드 입니다!!!!!!!" + name);
    }
    //3.void 매소드 : 리턴값이 없는 매소드 void
    //              : 매개변수 없는 매소드(매개변수1,매개변수2)
    public static void Method3(int a , int b) {
        System.out.println("a + b = " + (a+b) );

    }

    //4.정수형 리턴값이 있는 매소드
    //              : 매개변수 없는 매소드(매개변수1,매개변수2)
    public static int Method4(int a, int b ) {
        return a + b ;
      
    }
    
    //5.정수형 리턴값이 있는 매소드
    //              : 매개변수 없는 매소드(매개변수1,매개변수2)
    public static int Method5(int x, int y , int z) {
        return x * y + z ;

    }
    //오버로딩(overloading) 
    //6.리턴값 ,자료형,매소드 이름 같음 (매개변수 , 자료형이 다르다)   
    //매개변수 자료형이 다르면 같은 이름의 매소드 사용 가능하다.
    //                정수형 리턴값이 있는 매소드
    //              : 매개변수 없는 매소드(매개변수1,매개변수2)
    public static int   Method5(int x, int y , long z) {
        return x * y + (int)z ; //강제 형 변환

    }
    public static long  Method5(int x, long y , long z) {
        return x * y + z ;

    }
    public static long  Method5(long x, int y , long z) {
        return x * y - z ;

    }
    public static long  Method5(long x, long y , int z) {
        return x * y / z ;

    }
    public static long  Method5(long x, long y , long z) {
        return x * y * z ;

    }
    public static String  Method5(String x, String y ) {
        return x + "," + y;

    }
  


}
