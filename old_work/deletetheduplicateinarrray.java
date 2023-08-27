/**
 * deletetheduplicateinarrray
 */
public class deletetheduplicateinarrray {

    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,3,4,4,5,5};
        int ajj[];
         ajj = new int[(arr.length)/2];
        int i,j=-1,k,a=0;
        for(i=0;i<arr.length-1;i++){
            if (arr[i]==arr[i+1]){
                 j++;
                 ajj[j]=i;
            }
        }
        for(k=0;k<=j;k++){
           a=ajj[k];
           arr[a]=arr[a+1];
           
        }
       for(int b =0;b<arr.length;b++){
         System.out.println(arr[b]);
       }
    }
}