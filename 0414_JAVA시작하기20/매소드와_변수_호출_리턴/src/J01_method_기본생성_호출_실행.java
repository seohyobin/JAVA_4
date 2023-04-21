
/**
 * J01_method_ 기본생성_호출_실행
 */
public class J01_method_기본생성_호출_실행{

    public static void main(String[] args) { //모든 클래스에 1개만 존재하는 main 매소드!!!!!!!
        //void 는 return값 이 없음 !!!!!!!!!!!!!!!!!!!!!!!!!!!!! 나머지는 다 있어!!!!
        //Method
        //1.메소드 선언 =>함수 같은 종류
        //리턴타입 메소드이름(타입 매게변수1.....){ 
            //실행문 (영역 => scope)
        //}

        //기타 프로그램에서의 메소드와 함수 
        //예)
        //객체내에서의 함수 =>메소드
        /*
        const Object = new Object();
        Object = {
            state:{ //멤버변수, 속성, 필드
                isLogin:true;
            },
            mainSlide : function(){

            },
            scrollEvent(){

            },
        }
        Object.state;
        Object.state();

        init(){
            this.state;
            this.mainSlide();
        }


        class Object2 {
            state:{
                cnt:0
            }
            mainsSlide(){

            }
            mainsSlide2(){

            }
            
        }

        function mainSlide(){

        }

        void  음식(떡볶이,오뎅){
            system.out.println();
        };

        int 음식(떡볶이,오뎅,순대)
         */



         //접근제한자  public

         //public static 리턴타입(자료형(int,string....),void(리턴없음)) 매소드이름(){}
         //public static 리턴타입(자료형(int,string....),void(리턴없음)) 매소드이름(매개변수){}

         //메인 매소드
         MainSlide("김유신");
         MainSlide("이순신");
         MainSlide("서효빈");
         MainSlide("서효빈");
         MainSlide("서효빈");
         MainSlide("서효빈");
 


     
        
    }
    public static void MainSlide(String irum){//=>매소드 호출실행 메인 매소드 내에서 매소드 이용();
        System.out.println("메인슬라이드 매소드 입니다!!!!! " + irum);
     }
}