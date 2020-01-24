import java.util.*;
import java.io.*;
class hashMap{
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"hi");
        hm.put(2,"hello");
        hm.put(3,"bye");
        String x=hm.remove(2);
        System.out.println(x);
        for(int i=0;i<hm.size();i++){
            if(hm.get(i)==null){
                hm.put(i,"new");
            }
        }
        System.out.println(hm);
    }
}