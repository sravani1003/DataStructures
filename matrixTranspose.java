class matrixTranspose{
    public static void main(String[] args){
        int arr[][]={{2,3},{1,6}};
        int m=2;
        int n=2;
        int temp[][]=new int[2][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(temp[i][j]);
            }
        }
      
    }
}