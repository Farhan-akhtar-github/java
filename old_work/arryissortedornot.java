/**
 * arryissortedornot
 */
public class arryissortedornot {

    public static void main(String[] args) {
        boolean a = true;
        int arr[]={0,1,2,3,5,6,7,8,9,10};
        if(arr.length==1){
            a=true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
             a=true;
            }
            else{
              a=false;
              break;
            }
        }
        System.out.println(a);
    }
}