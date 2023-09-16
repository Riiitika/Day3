public class reversearray {

public static void reversearr(int arr[]){

    int start=0 , end = arr.length-1;
    if(start<end){
        // swap element
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start]= temp;
        start++;
        end--;
    }
  
}


public static void main(String args[]){

int arr[]= {2,4,6,8,10};
reversearr(arr);

for(int i=0; i<=arr.length ; i++){
 System.out.print(arr[i] + " ");
}
System.out.println();
}

    
}
