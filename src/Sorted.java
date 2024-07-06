public class Sorted{
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6};
        int[] b = {3, 7, 8, 10};
        int[] result = mergeArrays(a, b);


        System.out.println("Merged sorted arrays:");
        printArray(result);
    }
        public static int[] mergeArrays(int[] a,int[] b){
            int n1 = a.length;
            int n2 = b.length;
            int[] result = new int[n1+n2];

            int i=0,j=0,k=0;

            while(i<n1 && j<n2){
                if(a[i]<b[j]){
                    result[k++]=a[i++];
                } else
                {
                    result[k++]=b[j++];
                }
            }
            while(i<n1){
                result[k++]=a[i++];
            }
                while(j<n2) {
                    result[k++] = b[j++];
                }
                return result;
            }
            public static void printArray(int[] arr){
            for(int num:arr){
                System.out.print(num+" ");
            }
                System.out.println();
            }
        }

