import java.io.*;
import java.util.*;
class queueArray{
    static int capacity;
    static int rear = 0;
    static int front = 0;
    static int q[];
    Queue<Integer> q = new Queue<Integer>(capacity);

    public static void queue_push(Queue<Integer> q, int x) {
        if(front==rear){
            System.out.println("Queue empty");
        } else if(capacity==rear){
            System.out.println("queue full");
        }
        else{
            q[rear]=x;
            rear+=1;
        }
    }
    public static void queue_pop(Queue<Integer> q){
        if(front==rear){
            System.out.println("Queue empty");
        }
        else{
            for(int i=0;i<rear-1;i++){
                q[i]=q[i+1];
            }
            if (rear<capacity) 
                q[rear]=0;
            rear--;
        }
    }
    public static void main(String[] args){
        int capacity=4;
        Queue<Integer> q = new Queue<Integer>(capacity);
        queue_push(q,2);
        queue_push(q,4);
        queue_push(q,1);
        queue_pop(q);
        for(int i=front;i<rear;i++){
            System.out.println(q[i]);
        }
    }
}