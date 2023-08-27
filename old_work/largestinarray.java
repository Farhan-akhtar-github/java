/**
 * largestinarray
 */
public class largestinarray {

    public static void main(String[] args) {
        int arr[]={1,4,6,2,5,0};
        int i,res=0;
        for(i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        System.out.println(res);
        System.out.println(arr.length);


    }
}