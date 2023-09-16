
public class linearsearch{

    public static int lSearch(int element[], int keyvalue){

        for(int i=0; i<=element.length;i++) {

            if(element[i]== keyvalue){
                return i;
            }
         
        }

        return -1;

    }
public static void main(String args[]){
    int element[] = {2,4,6,8,10,12,14,16};
    int keyvalue=4;
    System.out.println( lSearch(element, keyvalue)); 
}
}