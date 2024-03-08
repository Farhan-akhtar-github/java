public class stock2 {
    public static void main (String[] args){
        int[] prices={7,1,5,3,6,4}
        int j;
        int day_profit;
        int sum=0;
        for(i=0;i<prices.length;i++){
            for(j=0;j<prices.length;j++){
                day_profit=prices[j]-prices[i];
                if(day_profit>0){
                   sum=sum+day_profit;
                   i=j;
                }
            }
        }
    }
}