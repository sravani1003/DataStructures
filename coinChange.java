import java.util.Arrays;
class coinChange{
    public static int prob(int arr[],int n){
        int res[]=new int[n+1];
        Arrays.fill(res,0);
        res[0]=1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=arr[i];j<=n;j++)
            {
                res[j]+=res[j-arr[i]];
            }
        }
        return res[n];
    }
    public static void main(String[] args){
        int arr[]={1,2,5};
        System.out.println(prob(arr,5));
    }
}