import java.io.*;
import java.util.*;
public class isogram {
    public static boolean isIsogram(String s) {
        s.toLowerCase();
        String[] arr = s.split("");
        Set<String> hs=new HashSet<String>(Arrays.asList(arr));
        for(int i=0;i<s.length();i++){
        
        if(hs.size()==s.length()){
        return true;
        }
        else{
        return false;
        }
        
        } 
    }
    public static void main(String[] args){
        String s="helloall";
        isIsogram(s);
        if(isogram.isIsogram){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}