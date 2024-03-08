/**
 * subarrayk
 */
public class subarrayk {

    public static void main(String[] args) {
        int arr[]={20,30,1,100};
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int k=3;
        int i;
        
        int n= arr.length-(arr.length-k);
        for ( i = 0; i < 4; i++) {
            sum=0;
            for (int j = i; j < k; j++) {
                sum=sum+arr[j];
                maxsum=Math.max(maxsum, sum);
            }
        }
        System.out.println(maxsum);

    }
}