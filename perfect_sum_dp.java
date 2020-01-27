import java.io.*;
import java.util.*;
class perfect_sum_dp{
    static boolean dp[][];
    static void disp(ArrayList<Integer> v) 
    { 
       System.out.println(v); 
    }
    public static void subset(int arr[],int i,int k,ArrayList<Integer> list){
        if(i==0 && k!=0 && dp[0][k]){
            list.add(arr[i]);
            disp(list);
            list.clear();
            return;
        }
        if(i==0 && k==0){
            disp(list);
            list.clear();
            return;
        }
        if(dp[i-1][k]){
            ArrayList<Integer> b=new ArrayList<>();
            b.addAll(list);
            subset(arr,i-1,k,b);
        }
        if(k>=arr[i] && dp[i-1][k-arr[i]]){
            list.add(arr[i]);
            subset(arr,i-1,k-arr[i],list);
        }
       
        
    } 
    public static void print_subset(int arr[],int n,int k){ 
        if(n==0 || k<0){
            return;
        }
       
        dp=new boolean[n][k+1]; 
        for (int i=0;i<n;++i) 
        { 
            dp[i][0]=true;   
        } 
        if (arr[0]<=k) 
           dp[0][arr[0]] = true; 
        for (int i = 1; i < n; ++i) 
            for (int j = 0; j < k + 1; ++j) 
                dp[i][j] = (arr[i] <= j) ? (dp[i-1][j] || 
                                           dp[i-1][j-arr[i]]) 
                                         : dp[i - 1][j]; 
        if (dp[n-1][k] == false) 
        { 
            System.out.println("There are no subsets with" +  
                                                  " sum "+ k); 
            return; 
        } 
        
        ArrayList<Integer> list = new ArrayList<>(); 
        subset(arr, n-1, k, list); 
    } 
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int k=5;
        print_subset(arr,n,k);
    }
}