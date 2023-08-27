package task;

public class ArrayUtils 
{
    public int sample[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    public void swapArrayItems(int a[], int i, int j){
        int temp    =   a[i];
        a[i]        =   a[j];
        a[j]        =   temp; 
    }

    public int getArrayMidIndex(int a[]){
        int lastIndex   =   a.length - 1;
        int mid         =   lastIndex/2;
        return(mid);
    }

    public int getMidIndex(int si, int ei){
        int size        =   ei - si + 1;
        int size_1      =   size - 1;
        int mid         =   si + (size_1/2);
        return(mid);
    }

    public void printArray( int a[]){
        int n = a.length;
        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
    }

    public int [] reverseFullArray(int a[]){
        int mid = getArrayMidIndex(a);
        int lastIndex = a.length - 1;
        for(int i=0; i<=mid; i++)
        {
            int j = lastIndex - i;
            swapArrayItems(a, i, j);
        }

        return(a);
    } 
    
    public int [] reverseArray(int a[], int si, int ei){
        int mid = getArrayMidIndex(a);
        int lastIndex = a.length - 1;
        for(int i=0; i<=mid; i++)
        {
            int j = lastIndex - i;
            swapArrayItems(a, i, j);
        }

        return(a);
    }  
}

/*
  
 void reverseArray() {
        int arr[]={0,1,2,3,4};
        int temp;
        int a=arr.length-1;
        for(int i=0;i<arr.length;i++){
            temp=arr[i];
            arr[i]=arr[a-i];
            arr[a-i]=temp;
            System.out.println(arr[i]);
} 
  
  
 */
