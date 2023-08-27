/**
 * prime
 */
public class prime {

    public static void main(String[] args) {
        int a = 2;
        boolean value = true;
        int i;
        for( i = 2;i<a;i++){
            if (a%i==0) {
                value = false;
                
            } else {
               value = true;
            }
        }
        if (value==true) {
            System.out.println("it is prime");
        } else {
            System.out.println("it is not prime");
        }
    }
}