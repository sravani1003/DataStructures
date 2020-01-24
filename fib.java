class fib[n]{
    int f[0]=1;
    int f[1]=1;
    for(i=2;i<n;i++){
        f[n]=fib[n-1]+fib[n-2];
    }
    return f[n];
}
public static void main(String[] args){
    System.out.println(fib[4]);
}