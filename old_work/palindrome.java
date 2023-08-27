/**
 * palindrome
 */
public class palindrome {
    public static boolean pnumber(int p) {
        
       int n= p;
       int last_number=0;
       int new_digitformation=0;
       for (int i = 0; n<0; i++) {
        last_number=n%10;
        new_digitformation=new_digitformation*10+last_number;
        n = n/10;
        }
        if (new_digitformation==p) {
            System.out.print("y");
            return true;
            
            
        } else {
            System.out.print("n");
            return false;
        }
        
    }


    public static void main(String[] args) {
        pnumber(121);
    }
}