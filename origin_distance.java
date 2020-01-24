import java.io.*;
import java.util.*;
import java.lang.*;
class origin_distance{
    public static ArrayList<List<Integer>> calculate(ArrayList<List<Integer>> list,int n){
        //int n=4;
        ArrayList<List<Integer>> res=new ArrayList<>(n);
        Iterator iter=list.iterator();
        int least_dist=10;
        while(iter.hasNext()){
            for(int i=0;i<n;i++){
            int dist=list.get(i).get(0)*list.get(i).get(1)+list.get(i).get(0)*list.get(i).get(1);
            if(dist<least_dist){
                res.add(list.get(i));
            }
        }
        }
        return res;
    }
    public static void main(String[] args){
        int n=4;
        ArrayList<List<Integer>> list=new ArrayList<>(n);
        ArrayList<List<Integer>> res=new ArrayList<>();
        list.add(Arrays.asList(-1,0));
        list.add(Arrays.asList(1,1));
        list.add(Arrays.asList(1,2));
        list.add(Arrays.asList(9,3));
        calculate(list,n);
        Iterator i=res.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}