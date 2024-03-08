import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class subarraysum {
   public static void main(String[] args) {
     int[] nums={0,0,0,0,0,0,0,0,0,0};
     int k=0;
     int presum=0;
     int count=0;
     Set<Integer> set = new HashSet<Integer>();
     for (int index = 0; index < nums.length; index++) {
        presum += nums[index];
        if(presum==k){
            count++;
        }
        if (set.contains(presum-k)) {
            count++;
        }
        set.add(presum);
        
     }
     System.out.println(count);
   }
}
