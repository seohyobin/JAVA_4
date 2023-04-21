/**
 * J03_일차원배열.문자열처리
 */
public class J04_일차원배열_문자열_글자단위처리 {

    public static void main(String[] args) {


        //str.charAt()=>
            String str = "winter";

            System.out.println(str + " , " +str.charAt(0));
            System.out.println(str + " , " +str.charAt(1));
            System.out.println(str + " , " +str.charAt(2));
            System.out.println(str + " , " +str.charAt(3));
            System.out.println(str + " , " +str.charAt(4));
            System.out.println(str + " , " +str.charAt(5));
            System.out.println();
            System.out.println();

            for(int i=0; i<str.length(); i++){
                System.out.println(str + " , " +str.charAt(i));
                System.out.println(str + " , " +str.toUpperCase().charAt(i));
                System.out.println(str + " , " +str.toLowerCase().charAt(i));
            }

            //summer 문자열을 문자 배열에 선언 생성하여 문자단위로 저장하라!
            //출력은 문자배열만 출력하시오!

           
           

            str="summer";
            char[] ch = new char[str.length()];
            //char[] a = new char[6];
             //for문 이용 문자 배열 방에 글자단위로 저장
            for(int i=0; i<str.length(); i++){
                ch[i]=str.charAt(i);
            }
            System.out.println();

             //while문 문자배열 값 출력
             int i = -1;
             while(i<ch.length-1){
                i++;
                System.out.println("ch["+ i +"]"+ ch[i]);
             }
             //while(i<ch.length()-1){}
            

    
    }
}