public class J01_객체_응용_배열 {

    public static void main(String[] args) {
        //단일 객체 사용

        //문제1] 
        //와플 waffle 객체를 만들고 그리고 생성자를 생성, 
        //기본생성자 와 멤버변수 값은 기본값   /////기본고객  0
        //생성자 매개변수는 2개
        //멤버변수는 구분(일반고객 , 단골고객 , 우수고객) , 가격(5000,10000,15000)


        //객체 배열 선언 사용 그리고 호출

        waffle[] waf = new waffle[6];
        System.out.println("=====waffle 객체 배열 처리=====");
        System.out.println();
        waf[0] = new waffle();
        waf[1] = new waffle("초코" , 10000);
        waf[2] = new waffle("바닐라" , 15000);
        waf[3] = new waffle("사과" , 20000);
        waf[4] = new waffle("생크림" , 20000 , 2);
        waf[5] = new waffle("초코아이스크림" , 25000, 10);

        //멤버함수(method) 호출 실행 6회 반복처리

        for(int i =0 ; i<waf.length; i++){
            waf[i].show();
        }

        System.out.println();
        System.out.println();


        waffle wa = new waffle();
        wa.show();

        waffle wa1 = new waffle("바닐라");
        wa1.show();

        waffle wa2 = new waffle("바닐라" , 10000);
        wa2.show();

        waffle wa3 = new waffle("바닐라" , 15000 , 3);
        wa3.show();
        
    }
}
//외부클래스 
class waffle{
    String 구분;
    int 가격;
    int 갯수 =1;
    
    public waffle(){
        this.구분 = "기본";
        this.가격 = 0;
    }
    
    public waffle(String sauce){
        this.구분=sauce;
        this.가격=0;
        
    }
    public waffle(String sauce,int price){
        this.구분=sauce;
        this.가격=price;
        
    }

    public waffle(String sauce , int price, int soo){
        this.구분=sauce;
        this.가격=price;
        this.갯수=soo;
    }

    void show (){
        System.out.println(구분 +"  "+ 가격  +"원 "+ 갯수 +"개");
    }

}


