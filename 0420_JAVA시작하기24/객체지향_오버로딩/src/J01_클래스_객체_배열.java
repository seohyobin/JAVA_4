/**
 * J01_클래스_객체_배열
 */
public class J01_클래스_객체_배열 {

    public static void main(String[] args) {
        //name  |  telecom  |  service
        //객체배열[]
        //매개변수 3개를 생성하고 처리하시오
        //아이폰       LG           120
        //갤럭시       KT            80
        //모토로라     SKT           100

        //생성자 생성 일반변수 개별 사용 
        //클래스이름 생성자이름 = new 클래스이름();

        //생성자 생성 배열변수 사용
        //클래스이름[] 생성자이름 = new 클래스이름[배열 수];
        Phone[] newPhone = new Phone[6]; 

        newPhone[0]= new Phone("아이폰");
        newPhone[1]= new Phone("아이폰", "120");
        newPhone[2]= new Phone("갤럭시", "KT", "80");
        newPhone[3]= new Phone("아이폰", "LG", "120");
        newPhone[4]= new Phone("모토로라", "SKT", "100");
        newPhone[5]= new Phone();

        for(int i =0; i<newPhone.length; i++ ){
            System.out.print("폰" + (i+1) +": ");
            newPhone[i].show();
        }
        System.out.println();

        
        ////////////////////////////////
        Phone[] newPhone2 = new Phone[3]; 
        System.out.println("========================");

        newPhone2[0]= new Phone("아이폰14");
        newPhone2[1]= new Phone("아이폰", "120");
        newPhone2[2]= new Phone("갤럭시플립", "KT", "80");
     

        for(int i =0; i<newPhone2.length; i++ ){
            System.out.print("폰" + (i+1) +": ");
            newPhone2[i].show();
        }
        System.out.println();



    }
}

//문제] 
//클래스 : 클래스 (객체) 이름 Phone
//필드 : Phone 클래스 내부 필드 : name,  telecom,  service
//자료형 : 타입은 적절하게 사용하세영
//기본 생성자
//생성자 : (매개변수) 2개,3개
//void 메소드 showTelecom 
//클래스 (객체) 생성자 배열[3] 반복처리
//결과를 출력하시오


class Phone{
    String name = " ";
    String telecom = " ";
    String service = " ";

    Phone(){
        this.name=" ";
        this.telecom=" ";
        this.service=" ";
        
    }



    Phone (String n){

        this.name=n;
    }

    Phone (String n, String t){

        this.name=n;
        this.telecom=t;
    }

    Phone (String n, String t, String s){

        this.name=n;
        this.service=t;
        this.telecom=s;
    }

    void show(){
        System.out.println();
        System.out.println("기종: " + name +"  통신사: " + service +"  서비스 시간: " + telecom);
        System.out.println();
    }
}



 