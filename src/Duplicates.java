public class Duplicates {
    public static void main(String args[]){
        int[] arr={7,8,6,7,6,9};
        int visited=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        arr[j]=visited;
                    }
                }
                System.out.println(arr[i]);
            }
        }
    }
}
