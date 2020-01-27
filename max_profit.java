import java.io.*;
import java.util.*;
class max_profit{
    public static int find_profit(int arr[],int n,int m){
        int max_pft=0;int max_pft1=0;
        //int i=0;
        for(int i=n;i<m;i++){
            for(int j=i+1;j<=m;j++){
                if(arr[j]>arr[i]){
                    max_pft1=arr[j]-arr[i] + find_profit(arr,n,i-1) + find_profit(arr,j+1,m);
                }
                else{
                    i=j;
                    break;
                }
                max_pft=Math.max(max_pft,max_pft1);
            }
        }
        return max_pft;
        
    }
    public static void main(String[] args){
        int arr[]={20,45,30,55,13,10};
        int l=arr.length;
        find_profit(arr,0,l-1);
        System.out.println(max_pft);
    }
}