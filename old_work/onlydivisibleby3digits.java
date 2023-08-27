/**
 * onlydivisibleby3digits
 */
public class onlydivisibleby3digits {

    public static void main(String[] args) {
        int number =9;
        int j =0;
        int i;
        for(i=number;i>0;i--){
            if(number%i==0){
              j++;
            }
        }
         if(j==3){
                System.out.println("true");
            }
            else{
                System.out.println("not true");
            }
    }
}