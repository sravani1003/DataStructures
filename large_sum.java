import java.io.*;
import java.util.*;
class large_sum{
    public static void sum_cal(int arr[],int k,int n){
        int max_sum=0;
        int temp=n;
        int x=0,y=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]>=k){
                temp=i;
                break;
            }
        }
        for(int i=0;i<temp;i++){
            for(int j=i+1;j<temp;j++){
                if((arr[i]+arr[j])<=k && (arr[i]+arr[j])>max_sum){
                    max_sum=arr[i]+arr[j];
                    x=arr[i];
                    y=arr[j];
                }
            }
        }
        System.out.println("pair is " + x + "," + y);
    }
    public static void main(String[] args){
        int arr[]={5,1,0,8,3,4};
        int k=10;
        int n=arr.length;
        sum_cal(arr,k,n);
        
    }
}