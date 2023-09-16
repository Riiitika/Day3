public class sub {

public static void SubArr(int subArr[]){

    int maxsum = Integer.MIN_VALUE;
    int currSum=0;
    for(int i=0; i<subArr.length;i++){
        int start =i;
        for(int j=i;j<subArr.length;j++){
            int end=j;
             currSum=0;

            for(int k=start;k<=end;k++){ //print

                System.out.print(subArr[k] + " "); 
                currSum = currSum + subArr[k]; 
               if(maxsum<currSum){
                maxsum = currSum;
               }
              
            }
             System.out.println( " : the sum is: "+currSum);
            
        } 
       System.out.println();
       
    }
    System.out.println("The max sum is: " + maxsum);

    
}

public static void main(String args[]){
    int subArr[] = {1,2,6,1,3};
    SubArr(subArr);
}
    
}
