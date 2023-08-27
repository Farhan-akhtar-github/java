/**
 * LCM
 */
public class LCM {
    public static int lcm(int a, int b){
        
        int d=0;
        for(int i=a*b;i>Math.max(a, b);i--){
            if(i%a==0 && i%b==0){
                d=i;
            }
            
            
        }
        System.out.println(d);
        return d;
    }

    public static void main(String[] args) {
        lcm(3, 7);
    }
}