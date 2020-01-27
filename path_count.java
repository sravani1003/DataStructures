import java.io.*;
import java.util.*;
class path_count{
    public static void paths(int x,int y){
        int count[][]=new int[x][y];
        for(int i=0;i<x;i++){
            count[i][0]=1;
        }
        for(int j=0;j<y;j++){
            count[0][j]=1;
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                count[i][j]=count[i-1][j]+count[i][j-1];
            }
        }
        System.out.println(count[x-1][y-1]);
    }
    public static void main(String[] args){
        paths(3,6);
    }
}