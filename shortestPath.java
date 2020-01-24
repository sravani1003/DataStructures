class shortestPath{
    public static int sp(int c[][],int m,int n)
    {
        
        int arr[][]=new int[m+1][n+1];
        arr[0][0]=c[0][0];
        for(int i=1;i<=m;i++)
        arr[i][0]=arr[i-1][0]+c[i][0];
        for(int j=1;j<=n;j++)
        arr[j][0]=arr[j-1][0]+c[j][0];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                arr[i][j]=min(arr[i-1][j-1],arr[i-1][j],arr[i][j-1])+c[i][j];
            }
        }
        return arr[m][n];
    }
    public static int min(int x,int y,int z)
     {
         if (x<y){
             return (x<z)?x:z;
         }
         else{
             return (y<z)?y:z;
         }
     }

    public static void main(String[] args)
    {
        int c[][]={{2,3,5,6},{3,4,1,6},{2,9,6,8},{1,4,8,3}};
        System.out.println(sp(c,2,2));
    }

}
