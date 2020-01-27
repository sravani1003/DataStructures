import java.io.*; 
class string_cnt{
    static int cnt_Str(int n) 
    { 
    return 1 + (n * 2) +  
           (n * ((n * n) - 1) / 2); 
    } 
public static void main (String[] args) 
{ 
    int n = 3; 
    System.out.println( cnt_Str(n)); 
} 
 
}