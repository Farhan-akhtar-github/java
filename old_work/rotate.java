public class rotate{
public static void main(String args[]){
     int arr[] = {2,0,0,1,1,1,0,1,1,1,1}
     arr[0]=arr[arr.length-1];
     for(int i=1;i<arr.length-2;i++){
        arr[i]=arr[i+1];
     }
     for(int y:arr){
        System.out.println(y);
     }
}
}