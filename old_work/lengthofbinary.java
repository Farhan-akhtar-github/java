/**
 * lengthofbinary
 */
public class lengthofbinary {

    public static void main(String[] args) {
        int n = 100;
        int i;
        int[] arr;
        int reminder; 
        for(i=1;n>0;i++){            
           arr= new int[i];
           reminder=n%2;
           arr[i-1]=reminder;
           n=n/2;
           System.out.println(arr[i-1]);
    }
}
}