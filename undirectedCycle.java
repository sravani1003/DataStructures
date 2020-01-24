import java.util.*;
class undirectedCycle{
    int V;
    ArrayList<Integer> adjl[];
    public static void addEdge(int v,int u){
        adjl[u].add(v);
        adjl[v].add(u);
    }
    public static void graph(int V){
        ArrayList<Integer> adjl[]=new ArrayList[V];
        for(int i=0;i<V;i++){
            adjl[i]=new ArrayList<Integer>();
        }
    }
    static boolean isConnected(ArrayList<Integer> adjl[],int V,int s,boolean visited[]){
        int newarr[]=new int[V];
        Arrays.fill(parent,-1);
        queue<Integer> q=new ArrayList<Integer>();
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty){
            int u=q.poll();
            for(int i=0;i<adjl[u].size();i++){
                int v=adj[u].get(i); 
                    if (!visited[v])  
                    { 
                        visited[v]=true; 
                        q.add(v); 
                        parent[v]=u; 
                    } 
                    else if (parent[u]!=v) 
                        return true;
            }
            return false;
        }
    }
        public static boolean isDisconntected(ArrayList<Integer> adjl[], int V) 
        { 
            boolean visited[] = new boolean[V]; 
            Arrays.fill(visited,false); 
  
            for (int i = 0; i < V; i++) 
                if (!visited[i] &&  
                     isConntected(adj, i, V, visited)) 
                    return true; 
            return false; 
        } 
        public static void main(String[] args)  
    { 
  
        int V = 4; 
        undirectedCycle obj=new undirectedCycle();
        obj.graph(4);
        obj.addEdge(adjl, 0, 1); 
        obj.addEdge(adjl, 1, 2); 
        obj.addEdge(adjl, 2, 0); 
        obj.addEdge(adjl, 2, 3); 
  
        if (obj.isDisconntected(adjl, V)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");
}
}