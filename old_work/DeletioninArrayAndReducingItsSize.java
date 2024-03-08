/**
 * deletioninarrayandreducingitsisze
 */
public class DeletioninArrayAndReducingItsSize {
      public static int size (int arr[],int n,int x){
        int i;
        int j;
        for(i=0;arr[i]!=x;i++){
            
        }
        if(i == n)
        return n;
        for(j=i;j<n;j++){
            arr[j]=arr[j+1];
        }
        

       return n;
    }

    public static void main(String[] args) {
        int arr[] = {3, 8, 12, 5, 6}, x = 12, n = 4;
        size(arr, n, x);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}