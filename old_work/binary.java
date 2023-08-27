/**
 * binary
 */
public class binary {

    public static void main(String[] args) {
        
            int n = 100;
      
            int i;

            int[] arr;

            int reminder;

            arr= new int[100];
      
            for(i=0;n>0;i++){

               reminder=n%2;

               arr[i]=reminder;

               n=n/2;

               System.out.println(arr[i]);
              
            }
        }
}