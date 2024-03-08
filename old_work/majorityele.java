/**
 * majorityele
 */
public class majorityele {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        
       int temp=arr[0];

        for (int index = 0; index < arr.length-1; index++) {
            arr[index]=arr[index+1];
        }
        
        arr[arr.length-1]=temp;
        for (int t : arr) {
            System.out.println(t);
        }
    }
}