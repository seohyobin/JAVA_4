public class J02_혼자하기 {
    public static void main(String[] args) {
        int[][] arr={
            {189,787,45,15,798},
            {152,487,74,28,4}
        };
        int[] sum = new int [arr.length];

        sum[0]=0;
        sum[1]=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum[i]+=arr[i][j];
                System.out.printf("%4d" , arr[i][j]);
            }
            System.out.printf("%5d" , sum[i]);
            System.out.println();
    
        }

    


        
    }
}
