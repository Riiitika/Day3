public class rotate {

public static int Rotatearr(int arr[],int target){

    int start =0 , end = arr.length;
    while(start<=end){
        int mid = (start+end)/2;
         if(arr[mid] == target){
         return mid;
    } 
    if(arr[mid]< target){
        start = mid+1;
    }
    else{
          end= mid-1;
    }
    
    }
    return -1;
   
}

public static void main(String args[]){
    int target =3;
    int arr[] = { 0,1,3,4,5,6,7};
    System.out.println(Rotatearr(arr, target));
}
    
}
