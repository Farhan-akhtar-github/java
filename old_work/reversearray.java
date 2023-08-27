/**
 * reversearray
 */
public class reversearray {
    // not working
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        int temp;
        int a=arr.length-1;
        for(int i=0;i<arr.length;i++){
            temp=arr[i];
            arr[i]=arr[a-i];
            arr[a-i]=temp;
            System.out.println(arr[i]);
        }
       
    }
}