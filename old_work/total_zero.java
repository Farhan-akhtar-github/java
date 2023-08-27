/**
 * total_zero
 */
public class total_zero {

    public static int total_zero(int x){
    int last_number;
    int zero=0;

     for(int i=0;x>0;i++){

        last_number=x%10;

        if(last_number==0){

             zero++;
        }

        x=x/10;
     }
     System.out.println(zero);
     
     return zero;
    }

    public static void main(String[] args) {
        total_zero(100300);
    }
}