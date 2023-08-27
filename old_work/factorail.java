/**
 * factorail
 */
public class factorail {
    public static int factorail(int a){
        int b=a;
        int i;
        
        for( i=1;i<b;i++){
            a=a*i;
            
            
           
        }
        System.out.println(a);
        
        
        return a;
    }
    public static void main(String[] args) {
        factorail(10);
        
       
    }
}