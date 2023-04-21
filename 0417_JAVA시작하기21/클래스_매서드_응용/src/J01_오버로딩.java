public class J01_오버로딩 {


    //매개변수 없고 static 키워드 없는 매소드
    //=>클래스 생성자 생성하고 매소드 호출 실행
    public void Overloading(){
        System.out.println("static 없는 method 실행");
    }
    //매개변수 없고 static 키워드 있는 매소드
    public static void Overloading(String str){
        System.out.println("매개변수 없는 기본 method " + str);
    }
    //////////////////////////////////////////////////////
    // 오버로딩1 메서드 선언
    // void없는 메서드는 리턴값 있는 메서드
    public static String Overloading(String name,String jikcheck){
        return name +", "+ jikcheck;
    }
    // 오버로딩2 메서드 선언
    public static int Overloading(int a, int b){
        return a+b;
    }
    // 오버로딩3 메서드 선언
    public static String Overloading(String a, int b){
        return a +", "+b;
    }
    //파라미터 수와 아규먼트 수가 달라도 되지만
    //파라미터 수가 아규먼트 수보다 적으면 오류!!
    // 오버로딩4 메서드 선언
    public static String Overloading(String a, int b, int c){
        return a + " " + (b * c);
    }
    // 오버로딩5 메서드 선언
    public static String Overloading(String a, int b, double c){
        return a + " " + (b + c);
    }


    public static void main(String[] args) {
        //static 없는 매소드
        //클래스 생성하고 실행한다.

        J01_오버로딩  newJ01_오버로딩 = new J01_오버로딩();



        String overload1 =Overloading("이순신","전라좌수영");
        int overload2 =Overloading(10,30);
        String overload3 =Overloading("김유신",50);
        String overload4 =Overloading("서효빈",50,90);
        String overload5 =Overloading("효빈" ,700 );

        System.out.println();
        newJ01_오버로딩.Overloading();//()리턴값없는 매서드 호출 실행
        Overloading("리턴값없는 기본 method");//()리턴값없는 매서드 호출 실행
        System.out.println();
        System.out.println("오버로딩1 결과 = "+overload1);
        System.out.println("오버로딩2 결과 = "+overload2);
        System.out.println("오버로딩3 결과 = "+overload3);
        System.out.println("오버로딩4 결과 = "+overload4);
        System.out.println("오버로딩5 결과 = "+overload5);
        System.out.println();


    }
    
}
