public class J05_ {
    public static void main(String[] args) {
        int[][] arr= new int[5][5];
        int cnt = 1;
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
   
                arr[i][j] = cnt++;
            } 
        }
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                System.out.printf("%3d" , arr[i][j]);
            } 
            System.out.println();
        }
        
    }
}
