import java.util.*;
public class twice {

public static boolean Twicenum(int num[]){
    for(int i=0; i<=num.length-1; i++){
        for(int j =i+1; j<num.length;j++){
            if(num[i]== num[j]){
                return true;
            }
        }   
    }
    return false;
}

public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {

        // System.out.print(" Enter the number of an array: ");
        int[] num = {2,2,4,5,6,7,8};
        
         System.out.println(Twicenum(num));
    }
    
}
    
}
