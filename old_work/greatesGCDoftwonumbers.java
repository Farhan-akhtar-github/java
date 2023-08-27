/**
 * greatesGCDoftwonumbers
 */
public class greatesGCDoftwonumbers {
     public static int twogcd(int a, int b){
        int c=0;

        int mnum= Math.min(a, b);

        for(int i=1;i<mnum;i++){

            if(a%i==0 && b%i==0){

                c=i;
            }
        }
        System.out.println(c);
        
        return c;
     }
    public static void main(String[] args) {
        twogcd(100, 10);
    }
}