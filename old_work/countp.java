public class countp {
    public static void main (String[] args){
        int nums[] = {1,2,3,4,5,6,3,3,3,3,3,3,3,3};
        int pattern[] = {1,1,2,1,1,1,2};
        int n= nums.length;
        int p= pattern.length;
        int pa=p-1;
        int r=0;
        int number=0;
        int j=0;
        int pnumber=0;
        for (int index = 0; index < pattern.length; index++) {
           switch (pattern[index]) {
            case 0:
                r=1;
                break;
            case 1:
                r=2; 
                break;   
            case -1:
                r=3;
                break;
            default:
                break;
           }
           number=number*10+r;
        }
        System.out.println(number);
        for (int i = 0; i < nums.length-1; i++) {
            if(j>p){
                pnumber=0;
               j=0;}
               if (nums[i] == nums[i+1]) {
                  pnumber=pnumber*10+1;
            } else if (nums[i] <nums[i+1]) {
                  pnumber=pnumber*10+2;
            } else if (nums[i] >nums[i+1]) {
                  pnumber=pnumber*10+3;
            }
            j++;
            if (pnumber==number) {
                System.out.println(i-pa);
                System.out.println(1+i);
                
            }
        }
        System.out.println(pnumber);
    
    }
    
}
