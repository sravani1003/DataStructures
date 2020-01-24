import java.util.*;
import java.io.*;
class hashTable{
    public static void main(String[] args){
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(1,"India");
        ht.put(2,"Germany");
        ht.put(3,"USA");
        ht.putIfAbsent(4,"Australia");
        ht.putIfAbsent(4,"Australia");
        System.out.println(ht);
        
    }
}