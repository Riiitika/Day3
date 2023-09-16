public class Binarysearch {

public static int Bsearch(int arr[] , int key){

    // calculate the mid
    int start=0 , end = arr.length-1;
    while(start <= end){
        int mid = (start + end)/2;

        if(arr[mid] == key){
            return mid;
        }

        if(arr[start]<key){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
    }
    return -1;
}

public static void main(String args[]){
    int arr[]= {2,4,6,8,10,12,14,18};
    int key = 10;
    System.out.println(Bsearch(arr, key));
}
    
}
