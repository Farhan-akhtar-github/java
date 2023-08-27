/**
 * largestdivisible
 */
public class largestdivisible {
    public static int divisblenumber(int x){
        int a=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
               a=i;
            }
        }
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
       divisblenumber(100);
    }
}