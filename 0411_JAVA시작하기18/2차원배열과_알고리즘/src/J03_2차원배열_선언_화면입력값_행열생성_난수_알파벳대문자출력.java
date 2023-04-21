import java.util.*;;
public class J03_2차원배열_선언_화면입력값_행열생성_난수_알파벳대문자출력 {
    public static void main(String[] args) {
        //2차원 배열  화면입력 행수, 열수 입력받는다.
        //각 행열 값은 난수*(65~91)를 이용 영문 대문자를 출력한다.
        //배열[i][j]=(int)(Math.random()*26+65); //실수 출력=>0~1 사이의 실수
        //아스키 코드(ASCII CODE) A(65)B(66)C(67)...Z(91) => 26자*난수 + 65
        //아스키 코드(ASCII CODE) a(97)b(98)c(99)...z(123) => 26자*난수 + 97
        //아스키 코드(ASCII CODE) 0(48)1(49)2(50)...9(57) => 10자*난수 + 48
        //영문 대문자 배열값 = 난수*26자+65 ==65 ~ 91 A ~ Z
        //영문 소문자 배열값 = 난수*26자+97 ==97 ~ 123 a ~ z
        //출력 겅제형변환 정수를 문자로 출력

        Scanner sc =new Scanner(System.in);
        int col=0;
        int row=0;
 
       
        System.out.println("행을 입력하세요");
        row=sc.nextInt();
        System.out.println("열을 입력하세요");
        col=sc.nextInt();
        char [][] arr =new char[col][row];
    
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                arr[i][j]=(char)(Math.random()*26+65);
            }
        }
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.printf("%4s" , arr[i][j]);
               
            }
            System.out.println();
        }
        System.out.println();

        //1.입력설계 : 정방형 2차원 배열 사용
        //줄1 ~ 30 범위로 입력
        //열1 ~ 30 범위로 입력

        int[][] arr1; //입력화면 행 , 열
        int rowNum=0;
        int colNum=0;
        arr1=new int[rowNum][colNum];


        System.out.println("1 ~ 30 정수 입력 : ");
        rowNum=sc.nextInt();

        //2.출력설계
        for(int i =0; i<arr1.length; i++){
            for(int j =0; j<arr1[i].length; j++){
                arr1[i][j]=(char)(Math.random()*26+65);
            }
        }

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.printf("%3c",(char)arr1[i][j]);
            }
        }

        
    }
}
