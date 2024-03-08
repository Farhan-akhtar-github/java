public class Main {
    public static void main (String[] args){
        int arr[] = {0,0,0,1,1,1,0,1,1,1,1,1};
    int n= arr.length;
    int count=0;
    int res=0;
    for(int i =0; i<arr.length; i++){
        if (arr[i]==1){
            count++;
            res=Math.max(res,count);
        }
        else{
           count=0;
        }
        
        
    }
    System.out.println(res);
    }
    
}
