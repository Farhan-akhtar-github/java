/**
 * split_number
 */
public class remove_duplicate_from_sorted_array {

    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3,3};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if (arr[count]!=arr[i+1]) {
                int x=arr[count];
                int y=arr[i+1];
                count++;
                arr[count]=arr[i+1];
                int a=arr[count];
                int b=arr[i+1];
                
                
            }
        }
        count++;
        for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
            
        }
    }
}