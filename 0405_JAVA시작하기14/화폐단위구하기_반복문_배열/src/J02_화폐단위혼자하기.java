import java.util.Scanner;

public class J02_화폐단위혼자하기 {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("금액을 입력하세요");
    long price = 256000;
    price=sc.nextLong();
    long om=0;
    long mw=0;
    long oc=0;
    long ch=0;


    om=price/50000;
    mw=(price-(om*50000))/10000;
    oc=(price-(om*50000)-(mw*10000))/5000;
    ch=(price-(om*50000)-(mw*10000)-(oc*5000))/1000;



    System.out.println("50000원" + om);
    System.out.println("10000원" + mw);
    System.out.println(" 5000원" + oc);
    System.out.println(" 1000원" + ch);

 }   
}
