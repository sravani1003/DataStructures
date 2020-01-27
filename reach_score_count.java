import java.io.*;
import java.util.*;
class reach_score_count{
    public static void score_count(int n){
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        arr[0]=1;
        for(int i=3;i<=n;i++){
            arr[i]+=arr[i-3];
        }
        for(int i=5;i<=n;i++){
            arr[i]+=arr[i-5];
        }
        for(int i=10;i<=n;i++){
            arr[i]+=arr[i-10];
        }
        System.out.println(arr[n]);
    }
    public static void main(String[] args){
        score_count(10);
        score_count(13);
        score_count(8);
    }
}