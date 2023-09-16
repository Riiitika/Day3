public class subarr {

public static void kudanesAlgo(int number[]){
    int currSum= 0;
int maxsum = Integer.MIN_VALUE;

for(int i=0; i<number.length; i++){

    currSum = currSum+number[i];
    if(currSum<0){
        currSum=0;
    }
    maxsum = Math.max(currSum, maxsum);
   
}
System.out.println(maxsum);
}

public static void main(String args[]){
    int number[] = {-2, -3, 4,-1,-2,1,5,-3};
    kudanesAlgo(number);
}
    
}
