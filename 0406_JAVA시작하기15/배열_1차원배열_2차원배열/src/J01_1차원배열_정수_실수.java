/**
 * J01_1차원배열_정수_실수_문자_문자열
 */
public class J01_1차원배열_정수_실수 {

    public static void main(String[] args) {
        //실수형 1차원 배열 생성하고 데이터를 대입하라.
        double[] grade = {4.5, 3.7, 2.8, 3.3, 4.2, 4.0, 3.2}; //7개 배열의 갯수(배열의 길이)
        //double[] grade = new double[7];
        //문제1] 배열값 ->배열 인덱스
        //3번째 배열 인덱스를 이용 데이터 가져오기
        //배열이름[index number] index는 0~n: n은 배열의 총갯수 -1
        //배열이름.길이 => grade.length => 결과  : 7 =>배열 인덱스 번호는 n-1이므로 7-1 = 6

        // System.out.println( "grade[0] " + grade[0] );  
        // System.out.println( "grade[1] " + grade[1] );  
        // System.out.println( "grade[2] " + grade[2] );  
        // System.out.println( "grade[3] " + grade[3] );  
        // System.out.println( "grade[4] " + grade[4] );  
        // System.out.println( "grade[5] " + grade[5] );  
        // System.out.println( "grade[6] " + grade[6] );
        ////////////////////////////////////////////////////
        //반복문for(){} 출력하라
        //반복문의 종료값은 grade.length 이용
        //단 조건이 있다. 점수가 3.5평균 이상 인원수를 카운트하라
        //1.조건문 필요
        //2.카운트 누적변수 필요
        //3.총점을 구해라!!(누적점수)
        //출력 3.5이상 데이터 출력하고 카운트 값 출력
        ///////////////////////////////////////////////////
        int cnt = 0;
        double sum=0.0;
        for(int i=0; i<grade.length; i++ ){
            if(grade[i] >=3.5  ){
                cnt++;
                sum+=grade[i];
                System.out.println( "grade["+ i +"] " + grade[i] );  
               
            }
            
    
        }
        System.out.println("for 성적3.5이상 인원수 " + cnt+"명");
        System.out.println("for 성적3.5이상 총점 " + sum+"점");
        System.out.println();

        //반복문while(){} 출력하라
        //반복문의 종료값은 grade.length 이용
        ///////////////////////while 문은 초기화 안하면 위랑 누적되버려!!!!!!!!!!!!!!!!
        int i =-1;
        cnt = 0;
        sum=0.0;
        while(i<grade.length-1){ //i < 7   :  -1 0 1 2 3 4 5 

            
            i++; // 0 1 2 3 4 5 6 7 =>버그 발생 인덱스번호 초과 오류->grade.length-1 로 만들어!!=>0 1 2 3 4 5 6 으로!!

            if(grade[i]>=3.5){
                cnt++;
                sum+=grade[i];
                System.out.println( "grade["+i +"]" + grade[i] );  
            }
           //나중에 증가값넣으면 처음 i 값 0// 위에 증가값 넣을거면 int i = -1; 로 지정
        }
        //총점 인원수
            System.out.println("while 성적3.5이상 인원수 " + cnt+"명");
            System.out.println("while 성적3.5이상 총점 " + sum+"점");
            System.out.println();
       
        

            
        
    }
}