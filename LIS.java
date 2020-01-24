class LIS{
    public static int seq(int arr[],int n){
        int lis[]=new int[n+1];
        int i,j,max=0;
        for(i=0;i<=n;i++)
        lis[i]=1;
        for(i=1;i<n;i++){
            for(j=0;j<=n;j++){
                if((arr[i]<arr[j]) && lis[i]<lis[j]+1)
                lis[i]=lis[j]+1;
            }
        }
        for(i=0;i<n;i++)
        if(max<lis[i])
        max=lis[i];

        return max;
    }
    public static void main(String[] args){
        int arr[]={2,3,6,1,5,8,9,20};
        System.out.println(seq(arr,(arr.length)-1));
    }
}