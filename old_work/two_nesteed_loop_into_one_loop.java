public class two_nesteed_loop_into_one_loop {
    public static void main(String[] args) {
        int n=5;
        int index;
        int i=0;
        int j=0;
        for (index = 0; i<n; index++) {
             j++;
            if(index==5){
                index=0;
                i++;
                
            }
        }
        System.out.println(j);
    }
}
