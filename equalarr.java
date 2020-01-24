import java.util.*;
import java.io.*;
class equalarr{
    public static boolean equal(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(n!=m){
            return false;
        }
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }

            }
            return true;
        }
        
    }
    public static void main(String[] args){
        int arr1[]={2,6,3,1};
        int arr2[]={1,3,6};
        equal(arr1,arr2);
        if(equal(arr1,arr2)){
            System.out.println("true");
        }
    }
}