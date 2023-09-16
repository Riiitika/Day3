// import java.util.*;

public class largearray {

public static int getLargest(int number[]){

     int large= Integer.MIN_VALUE;
    for(int i=0; i<number.length;i++){

        if(number[i]> large){
            large = number[i];
        }

    }
    return large;
}

public static void main(String args[]){
    int number[] = { 1,2,4,6,5};

    System.out.println("the laegest num. is: " + getLargest(number));
}
    
}
