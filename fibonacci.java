class fibonacci{
    public static int fib(int n){
    int f[]=new int[n+2];
    f[0]=1;
    f[1]=1;
    for(int i=2;i<=n;i++){
        f[i]=fib(i-1)+fib(i-2);
    }
    return f[n];
    }
    


public static void main(String[] args){
    System.out.println(fib(14));
}
}