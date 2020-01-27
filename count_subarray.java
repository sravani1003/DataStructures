import java.io.*;
import java.util.*;
class count_subarray{
    public static void subarray(int arr[],int n){
        int arr_size=0;
        int start=0;
        int end=0;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                sum=-1;
            }
            else{
                sum=1;
            }
            for(int j=i+1;j<n;j++){
                if(arr[j]==0){
                    sum+=-1;
                }
                else{
                    sum+=1;
                }
                if(sum==0 && arr_size<(j-i+1)){
                    arr_size=j-i+1;
                    start=i;
                }
                if(sum==0){
                    count++;
                }
            }
        }
        end=start+arr_size-1;
        if(arr_size!=0){
            System.out.println(count);

        }
        else{
            System.out.println("no such array");
        }
    }
    public static void main(String[] args){
        int arr[]={1, 0, 0, 1, 0, 1, 1,0};
        int n=arr.length;
        subarray(arr,n);
    }
}