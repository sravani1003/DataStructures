import java.io.*;
import java.util.*;
class task_min_time{
    public static void cal_time(int arr[],int n){
        int include=arr[0];
        int exclude=0;
        for(int i=1;i<n;i++){
            int include_new=arr[i]+Math.min(include,exclude);
            int exclude_new=include;
            include=include_new;
            exclude=exclude_new;
        }
        System.out.println(Math.min(include,exclude));
    }
    public static void main(String[] args){
        //int arr[]={6,2,3,7,4,8,9,20,12,3};
        int arr[]={10,5,7,8,2,4,10};
        int n=arr.length;
        cal_time(arr,n);
    }
}