import java.io.*;
import java.util.*;
class getMinStack{
    //static int minele;
    //static int t;
    public static void stack_push(Stack<Integer> stack,int x){
        if(stack.isEmpty()){
            System.out.println("empty");
            int minele=x;
            stack.push(x);
        }
        if(!stack.isEmpty()){
            if(int x<minele){
                stack.push(2*x-minele);
                minele=x;
            }
            else{
                stack.push(x);
            }
        }
    
    }
    public static void stack_pop(Stack<Integer> stack,int n){
        for(int i=0;i<n;i++){
            if(stack.peek()<=minele){
                int y=stack.pop();
                System.out.println(y);
            }
            else{
                stack.pop();
                System.out.println(minele); 
            }
        }
    }
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<Integer>();
        stack_push(stack,2);
        stack_push(stack,5);
        stack_push(stack,6);
        stack_push(stack,7);
        stack_pop(stack,4);
    }
}