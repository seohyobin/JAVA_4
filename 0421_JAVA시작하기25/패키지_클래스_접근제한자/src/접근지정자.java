/**
 * J01_
 */
public class 접근지정자 {
    public static void main(String[] args) {
       
       Sample aClass= new Sample();
       
       aClass.a=10;   //public  접근 지정자: 모든 패키지 모든 클래스 다 접근가능
       //aClass.b=10; //private 접근 지정자: 같은 클래스 내에서만 접근 가능(다른 클래스 다른 패키지에서는 접근 불가 - > 오직 자기 자신만 가능)
       aClass.c=10;   //default 접근 지정자: 같은 패키지 내에서 모든 클래스에 접근가능

    }
    
}

class Sample{
    public int a;
    private int b;
    int c;
}



