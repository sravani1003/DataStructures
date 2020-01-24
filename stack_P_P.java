import java.io.*;
import java.util.*;

class stack_P_P{
    public static void stack_push(Stack<Integer> stack,int n){
        /*if(stack.isFull()){
            System.out.println("full");
        }*/
        for(int i=0;i<n;i++){
            stack.push(i);
        }
    }
    public static void stack_pop(Stack<Integer> stack,int n){
        for(int i=0;i<n;i++){
            int y=stack.pop();
            System.out.println(y);
        }
        if(stack.isEmpty()){
            System.out.println("empty");
        }
    }
    public static void stack_peek(Stack<Integer> stack,int n){
        for(int i=0;i<n;i++){
            int y=stack.peek();
            stack.pop();
            System.out.println(y);
        }
        if(stack.isEmpty()){
            System.out.println("empty");
        }
    }
    public static void stack_search(Stack<Integer> stack,int n,int x){
        int i=0;
        if(stack.isEmpty()){
            System.out.println("empty");
        }
        while(i<n){
            int y=stack.pop();
            if(y!=x){
                i++;
            }
            else{
                System.out.println(y);
                break;
            }
        }
    }
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<Integer>();
        int n=7;
        stack_push(stack,n);
        stack_peek(stack,n);
        stack_search(stack,n,4);
    }
}