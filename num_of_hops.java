import java.io.*;
import java.util.*;
class num_of_hops{
    public static void hop_count(int n){
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i]+=arr[i-1]+arr[i-2]+arr[i-3];
        }
        
        System.out.println(arr[n]);
    }
    public static void main(String[] args){
        hop_count(5);
        hop_count(7);
        hop_count(3);
    }
}