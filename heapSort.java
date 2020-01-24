import java.util.*;
//import java.arrays.*;
class heapSort{
    public static void extract(int q[],int x){
        int temp=q[x];
        q[x]=q[0];
        q[0]=temp;
        heapify(q,0);

    }
    public static void heapify(int q[],int i){
        int n=q.length;
        int root=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && q[root]>q[l]){
            root=l;
        }
        if(r<n && q[root]>q[r]){
            root=r;
        }
        if(root!=i){
            int x=q[i];
            q[i]=q[root];
            q[root]=x;
            heapify(q,root);
        }
    }
    public static void sort(int q[]){
        int n=q.length;
        for(int i=n/2 - 1;i>=0;i--){
            heapify(q,i);
        }
    }
    public static void main(String[] args){
        int q[]={12,11,13,5,6,7};
        int n=q.length;
        heapSort obj=new heapSort();
        obj.extract(q,3);
        obj.sort(q);
        for(int i=0;i<n;i++){
            System.out.println(q[i]);
        }
    }
}