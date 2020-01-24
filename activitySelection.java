class activitySelection{
    public static void prob(int s[],int f[],int n){
        int i=0;
        int j;
        for(j=1;j<n;j++){
            if(s[j]>=f[i]){
                System.out.println(j);
                i=j;
            }
        }
    }
    public static void main(String[] args){
        int s[]={1,3,5,8,0,5};
        int f[]={2,4,7,9,6,9};
        prob(s,f,6);
    }
}