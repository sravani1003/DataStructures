import java.io.*;
class patternSearch{
    public static void search(String p[],String a[]){
        int x=p.length();
        int y=a.length();
        for (int i=0;i<=y-x;i++) { 
            int j; 
            for (j = 0; j < x; j++) 
                if (a.charAt(i + j) != p.charAt(j)) 
                    break;
            if (j == x)
                System.out.println(i); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        String t = "AABAACAADAABAAABAA"; 
        String p = "AABA"; 
        search(p,t); 
    } 
    
}