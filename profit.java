public class profit {
 public static int maxProfit(int price[]){
    int buy = price[0];
    int profit=0;
    for( int i=1 ; i<price.length ; i++){
        if(buy< price[i]){
            profit = Math.max(price[i] - buy , profit);
        } else{
            buy = price[i];
        }
    }
    return profit;
 }
public static void main(String args[]){

int price[] = {7,1,5,3,8,4};
System.out.println(maxProfit(price));

}
    
}
