import java.util.*;
import java.io.*;

class BFS{
    private LinkedList<Integer> adjl[];
    private int V;
    BFS(int v){
        V=v;
        LinkedList<Integer> adjl=new LinkedList<Integer>[v];
        for(int i=0;i<v;i++){
            adjl[i]=new LinkedList<Integer>();
        }
    }
    void addEdge(int v,int w){
        adjl[v].add(w);
    }
    void search(int s){
        boolean visited[]= new boolean[V];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);

        while(queue.size!=0){
            s=queue.poll();
            System.out.println(s);
            Iterator<Integer> i=adjl[s].listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args){
        BFS obj=new BFS(4);
        obj.addEdge(0,2);
        obj.addEdge(1,3);
        obj.addEdge(0,1);
        obj.addEdge(2,1);
        obj.addEdge(3,2);
        obj.addEdge(3,0);
        obj.search(2);
    }
}