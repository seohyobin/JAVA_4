/**
 * J01_연습
 */
public class J01_연습 {

    public static void main(String[] args) {
        
        int [][] arr = new int [6][6];
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=(int)(Math.random()*10+1);
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

      
    }
}