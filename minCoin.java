import java.io.*;
class minCoin{
    public static int prob(int arr[],int n) 
    { 
        int res[]=new int[n+1]; 
        res[0]=0; 
        for(int i=1;i<=n;i++) 
        res[i]=Integer.MAX_VALUE; 
        for(int i=1;i<=n;i++) 
        { 
            for(int j=0;j<arr.length-1;j++) 
            if (arr[j]<=i) 
            { 
                int sub_res=res[i-res[j]]; 
                if (sub_res!=Integer.MAX_VALUE  
                       && sub_res+1<res[i]) 
                       res[i]=sub_res+1; 
            }              
        } 
        return res[n];          
    } 
    public static void main (String[] args)  
    { 
        int arr[] = {9, 6, 5, 1}; 
        System.out.println(prob(arr,3)); 
    } 
}
