class rev_arr_grp{
    public static void revers(int arr[],int k,int n){
        for(int i=0;i<n;i+=k){
            int l=i;
            int r=Math.min(i+k-1,n);
            while(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l+=1;
                r-=1;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={1,5,2,7,3,9,4,6,0};
        int k=3;
        int n=arr.length;
        revers(arr,k,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}