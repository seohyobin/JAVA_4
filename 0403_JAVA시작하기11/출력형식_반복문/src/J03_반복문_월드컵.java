public class J03_반복문_월드컵 {
    public static void main(String[] args) {
        //2002년부터 2100년 까지 월드컵 개최년도를 출력하시오
    //     //1.for 반복문사용

    //    for(int world =2002; world<=2100; world++){
    //     if((world-2002) % 4 ==0){
    //         System.out.println(world + "년 월드컵");
    //         }
    //    }

       //2.그냥 4씩 증가!
       for(int world =2002; world<=2100; world+=4){ //4씩 증가
      
            System.out.println(world);
        
       }



    }
}
