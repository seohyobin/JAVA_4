public class J02_문자타입_배열처리 {
   public static void main(String[] args) {
    //문제1] 1문자 타입 배열 5개 길의 배열 생성하기
    //타입(자료형)지정 배열이름  new 키워드   타입 (자료형)지정(배열길이지정);
    char[] ch = new char[6];
     ch[0]='L';
     ch[1]='O';
     ch[2]='V';
     ch[3]='E';
     ch[4]='I';
     ch[5]='S';

     for(int i =0; i<=ch.length-1; i++){
        if(i==4){
            System.out.print(" "); //4번째인 I 앞에서 공간 벌린다.
        }
        System.out.print(ch[i]);
       
        // if(i==3){ //E 다음에 공간 벌린다.
        //     System.out.print(" ");
        // }
        
     }
     
     System.out.println();
     System.out.println();
     
     int i =-1; //-1 출발이 되어야 증가값이 0으로 된다.
    while(i<ch.length-1){
        i++;
        if(i==4){
            System.out.print(" ");
        }
        System.out.print(ch[i]);
    }
    
   } 
}
