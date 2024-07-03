public class Maximum {
    public static void main(String[] args) {
        int[] num={10,20,90,80,50};
        int max=num[0];
        for(int i=1;i<num.length;i++){
           if(num[i]>max) {
               max=num[i];
           }
        }
        System.out.println(max);
    }
}
