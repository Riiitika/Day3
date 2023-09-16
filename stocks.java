public class stocks {

public static int buySellstock(int price[]){
    int buyprice= Integer.MAX_VALUE;
    int Maxprofit= 0;

    for(int i=0; i<price.length; i++){
        if(buyprice < price[i]){
            int profit = price[i] - buyprice;
            Maxprofit= Math.max(Maxprofit, profit);
        } else{
            buyprice = price[i];
        }
    }
    return Maxprofit;
}
    

public static void main(String args[]){
    int price[] = {7,1,5,3,6,4};
    System.out.println(buySellstock(price));
}
}
