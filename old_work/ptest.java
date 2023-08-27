/**
 * ptest
 */
public class ptest {
    public static String is_palindrome(int n)
    {
       int p= n;
       
       int last_number=0;
       
       int new_digitformation=0;
       
       for (int i = 0; p<0; i++) 
       {
        last_number=p%10;
        
        new_digitformation=new_digitformation*10+last_number;
        
        n = p/10;
        
        }
        
        if (new_digitformation==n) {
            System.out.print("y");
            return ("yes");
            
            
        } else {
            System.out.print("n");
            return ("no");
        }
    }

    public static void main(String[] args) {
        is_palindrome(343);
    }
}