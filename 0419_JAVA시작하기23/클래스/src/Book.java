/*
 * 1.생성자 이름은 반드시 클래스 이름과 같아야한다.
 * 2.생성자는 리턴값이 없다.
 * 3.생성자는 void값이 없다.
 * 4.생성자는 몇가지만 제외하면 method와 다르지 않다.
 * 5.생성자는 method처럼 클래스내에 선언되고 오버로딩이 가능하다.
 * 6.하나의 클래스에 여려개의 생성자가 존재할수있다.
 * 7.기본생성자가 자동으로 생성될 수 있다. 
 * 8.클래스에 생성자가 하나도 정의되어있지 않다면 컴파일러가 자동으로 기본 생성자를 생성시켜서 컴파일해준다.
 * 
 * //생성자 오버로딩
 * 매개변수를 달리하는 생성자를 여러개 선언할 수 있다.
 * 클래스 이름 (){}
 * 클래스 이름 (매개변수1){}
 * 클래스 이름 (매개변수1,매개변수2){}
 * 클래스 이름 (매개변수1,매개변수2,매개변수3){}
 */
public class Book {
    //멤버 변수 (필드 =속성 = 프로퍼티)
    String title;
    String author;
    
    //멤버변수
    //자료형 없다 (리턴없음)
    //void 없음 

    public Book(String t){ //생성자
        title = t;
        author = "작자미상";
        
    }   
    //public Book ("어린왕자","생택쥐페리"){//생성자
    public Book(String t , String a){
        title=t;
        author=a;

    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자","생택쥐페리")   ;
        Book loveStory = new Book("춘향전");

        System.out.println(littlePrince.title + "  "+ littlePrince.author);
        System.out.println(loveStory.title+ "  " + loveStory.author);

        System.out.println("======waffle2 waffle3");
        System.out.println();


        //생성자 생성 
        waffle2 w2 = new waffle2("생크림",3000);
        w2.showW2();
        //생성자 w2를 이용해서 waffle2 클래스 내부에서 호출실행할 매소드를 만들어 준다.
        waffle3 w3 = new waffle3("바닐라" ,2000);
        w3.showW3();
        waffle3 w33 = new waffle3("딸기" ,2000);
        w33.showW3();
        waffle3 w333 = new waffle3("초코" ,2000);
        w333.showW3();



    }
    
}

    

///////////waffle2 => this 

class waffle2 { //루트영역 this
 String name;   //클래스 내부에서 접근할때 사용 가능하다. this.name 
 int price;     //this.price

//매개변수 2개의 생성자를 생성선언했음=> 기본 생성자는 만들어지지 않는다.
waffle2 (String n, int p){
    //생성자의 매개변수 값으로 멤버변수를 초기화
    //this 로 객체에 멤버변수에 접근할 수 있다.

    this.name =n;
    this.price =p;

    //this 객체를 도입 
}

// 출력 매소드  w2

void showW2(){
    System.out.println("이름 : "+ name + "와플" + "/ 가격 : " + price + "원");
}


}

class waffle3{
    String name;
    int price;

    //기본 생성자 : 클래스이름 그대로 
    waffle3(){
        this.name="기본메뉴";
    }

        //생성자 오버로딩
        waffle3(String name){
            //지역변수는 클래스의 멤버변수가 우선이다.
             String n;


            this.name = name; // 매개변수 name 의 값을 매개변수 값으로 변경가능하다.
                              // 접근방식은 this 사용
        }
        waffle3(String n,int p){
            this.name = n; // 매개변수 name 의 값을 매개변수 값으로 변경가능하다.
            this.price=p;
        }
        // 출력 매소드 w3
        void showW3(){
            System.out.println("이름 : "+ name + "와플" + "/ 가격 : " + price + "원");
        }
    
    
}

