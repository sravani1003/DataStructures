import java.io.*;
import java.util.*;
class hashRepeat{
    public static void prob(int arr[]){
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                System.out.println("element repeat at "+i);
                break;
            }
            else{
                hs.add(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int arr[]={2,4,3,8,7,2,9,3,6,2};
        prob(arr);
    }
}