/**
 * J01_화폐단위구하기
 */
public class J01_화폐단위구하기 {

    public static void main(String[] args) {
        //금액 187000
        //50000원
        //10000원
        // 5000원
        // 1000원
        //문제1 위 금액을 각 지폐 단위로 매수를 구하시오.
        
        //1.입력설계[INPUT]
        int price = 187000;
        int om = 0;
        int mw = 0;
        int oc = 0;
        int ch = 0;

        //3.처리
        om=price/50000;
        mw=(price-(om*50000))/10000;
        oc=(price-(om*50000+mw*10000))/5000;
        ch=(price-(om*50000+mw*10000+oc*5000))/1000;

        om=price/50000;
        mw=(price-(om*50000))/10000;
        oc=(price-(om*50000)-(mw*10000))/5000;
        ch=(price-(om*50000)-(mw*10000)-(oc*5000))/1000;
       
       
       
      


        //2.출력설계[OUTPUT]

        System.out.println("금액" +price+"원");
        System.out.println();
        System.out.println("50000원 " +om+"장");
        System.out.println("10000원 " +mw+"장");
        System.out.println(" 5000원 " +oc+"장");
        System.out.println(" 1000원 " +ch+"장");
    }
}