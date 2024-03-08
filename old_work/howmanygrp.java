/**
 * howmanygrp
 */
public class howmanygrp {

    public static void main(String[] args) {
        int arr[]={0,0,0,1,0};
        int temp=arr[0];
        int zero=0;
        int one=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=temp) {
                temp=arr[i];
                if (arr[i-1]==0) {
                    zero++;
                } else {
                    one++;
                }
            }
        }
        if (temp==0) {
            zero++;        }
            else{
               one++;
            }
        System.out.println(zero);
        System.out.println(one);
    }
}