/**
 * subarrsum
 */
public class subarrsum {

    public static void main(String[] args) {
        int sum=0,res=0;
        int[] arr = {-3,-6,-8, 8, -2, 4,40, -5, 6,8,9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0) {
                sum=sum+arr[i];
                res=Math.max(res,sum);

            } else {
                sum=0;
                
            }
            
        }
        System.out.println(res);
    }
}