public class J02_클래스_오버로딩 {
    public static void main(String[] args) {
        
        //클래스와 오버로딩
        /*
            하나의 클래스에 같은 이름의 메소드를 여러개 선언하는 것.
            같은 이름의 메소드로 입력 매개변수 값에 따라 다른 메소드를 호출하여 사용한다.

            *오버로딩 조건
            1.메소드 이름이 같아야함
            2.매개변수의 갯수 혹은 타입이 달라야한다.
        */ 


        //클래스 생성자를 생성하여  오버로딩 구현
        //하나의 클래스 내에 같은 이름의 매소드를 오버로딩 구현

        //선택한 와플에 따른 주문내역 출력하기
        
        waffle newwaffle = new waffle();

        //sauce가 없는 와플 주문: 매개변수가 없다.
        String 주문내역 = newwaffle.name();
        System.out.println(주문내역 +"주문하였습니다");
        System.out.println();

        String 주문내역2 = newwaffle.name("핫소스");
        System.out.println(주문내역2 +"주문하였습니다");
        System.out.println();

        String 주문내역3 = newwaffle.name("핫소스","아이스크림 ");
        System.out.println(주문내역3 +"주문하였습니다");
        System.out.println();

        String 주문내역4 = newwaffle.name("아이스크림 ","사과잼 " , 5);
        System.out.println(주문내역4 +"주문하였습니다");
        System.out.println();


    } ///////////////////////메인
    
}

    //클래스 제작
    //클래스 한개에 다양한 주문형식의 매소드가 선택되어 주문 되어진다.

    class waffle {
        //리턴값이 있는 매소드

        //1.매개변수 없는 매소드
        String name(){
            return "와플";
        }

        //2.매개변수 문자열 1개 있는 매소드
        String name(String sauce){
            return sauce + "와플";
        }

        //3.매개변수 문자열 2개 있는 매소드
        String name(String sauce1, String sauce2 ){
            return (sauce1 + sauce2) + "와플" ;
        }

        //4.매개변수 문자열 3개 있는 매소드
        String name(String sauce, String sauce2 ,int count){
            return sauce + sauce2 + "와플" + count + "개";
        }
    }
