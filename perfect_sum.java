import java.io.*;
import java.util.*;
class perfect_sum{
    public static void perf_sum(int arr[],int n,int k){
        int sum=0,count=0;
        for(int i=0;i<n;i++){
            sum=arr[i];
            if(sum==k){
                count++;
            }
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                System.out.println(sum);
                if(sum==k){
                    count++;
                    sum=arr[i];
                }
            }
        }
        if(count!=0){
            System.out.println(count);
        }
    }
    public static void main(String[] args){
        int arr[]={2,3,5,6,8,10};
        int n=arr.length;
        int k=10;
        perf_sum(arr,n,k);
    }
}