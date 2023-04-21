/**
 * J03_일차원배열.문자열처리
 */
public class J03_일차원배열_문자열처리 {

    public static void main(String[] args) {
        //문제1]
        //문자열 배열 선언하고 생성하기
        //배열의 길이는 10개로 한다.
        //데이터는 인기 스타 또는 연예인 이름 넣기


        //1.배열선언
            String[] names  =new String[10];

            names[0]="딸기";
            names[1]="바나나";
            names[2]="체리";
            names[3]="수박";
            names[4]="귤";
            names[5]="자몽";
            names[6]="키위";
            names[7]="오렌지";
            names[8]="블루베리";
            names[9]="사과";
           
        //2.생성하기
            //for
            for(int i =0; i<=names.length; i++){
                //이름이 2글자 이하인 이름만 출력

                if(names[i].length()<=2){
                    System.out.println(names[i]);
                 
                }
                //System.out.println( "for문 names ["+i +"] " + names[i] );  
            }
            //while
            //배열전체 출력
            //출력 예시 ] 이름 , 글자수
            // int i=0;
            // while(i<names.length-1){
            //     i++;
            //     System.out.println("이름:" +names[i] +"글자수" +names[i].length() );
            
               
            // }
            //문자열을 글자단위로 출력해보자!!!!!!!!!!!!!!!!!!!!!!!!

            String str = "winter";

            System.out.println(str + "," +str.charAt(0));
            System.out.println(str + "," +str.charAt(1));
            System.out.println(str + "," +str.charAt(2));
            System.out.println(str + "," +str.charAt(3));
            System.out.println(str + "," +str.charAt(4));
            System.out.println(str + "," +str.charAt(5));
        //3.배열데이터 넣기
    }
}