import java.util.Arrays;

public class Rotating {
    public static void rotated(int[] arr, int steps) {
       int n=arr.length;
        steps=steps%n;
        for(int i=0;i<steps;i++){
            int temp=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
                }
                arr[0]=temp;
        }}
        public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int steps=1;

            System.out.println("original array:"+ Arrays.toString(arr));
            rotated(arr,steps);
            System.out.println("Rotating  array:"+ Arrays.toString(arr));

        }
    }
