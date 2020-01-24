import java.util.*;
import java.io.*;
class hashing{
    public static int hashfunc(int x){
        return x % 4;
    }
    public static void prob(int n){
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>(6);
    for(int i=15;i<n;i++){
        int index=hashfunc(i);
        hm.put(index,i);
    }
}
    public static void main(String[] args){
       
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>(6);
        prob(20);
        System.out.println(hm);
    }
    
}