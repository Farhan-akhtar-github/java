/**
 * evenoddlargest
 */
// not correct for every test case
public class evenoddlargest {

    public static void main(String[] args) {
        int res = 0;
    	int curr = 0;
        int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;
    	for(int i = 1; i < n; i++)
    	{
    			if((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)
    			   ||(arr[i] % 2 != 0 && arr[i - 1] % 2 == 0))
    				{
    					curr++;

    					res = Math.max(res, curr);
    				}
    				else
    					curr = 1;
    	}
    	
    	System.out.println(res);
    }
}