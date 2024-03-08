public class sortoneteothree {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        int count1=0,count2=0,count0=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]==0){
                 count0++;
             }
             if(nums[i]==1){
                 count1++;
             }
             if(nums[i]==2){
                 count2++;
             }
        }
        int j,k,l;
        for(j=0;j<count0;j++){
            nums[j]=0;
            
        }
    
        for( k=j;k<count1+count0;k++){
            nums[k]=1;
            
        }
        for( l=k;l<count0+count1+count2;l++){
            nums[l]=2;
        }
        for(int a=0;a<nums.length;a++){
            System.out.println(nums[a]);
        }
        for (int iterable_element : nums) {
            System.err.println(nums[iterable_element]);
        }
        
    }
}
