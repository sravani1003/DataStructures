import java.io.*;
import java.util.*;
class arr_sort_freq{
    public static void main(String[] args){
        int arr[]={1,3,2,2,2,2,5,5,3,3,1,3,5,9,6,4,0};
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i: arr){
            int count=map.getOrDefault(i,0);
            map.put(i,count+1);
            list.add(i);
        }
        SortComparator comp=new SortComparator(map);
        Collections.sort(list,comp);
        for(int i: list){
            System.out.println(i);
        }
    }
    class SortComparator implements Comparator<Integer>{
        private final Map<Integer,Integer> mapf;
        SortComparator(Map<Integer,Integer> tmap){
            this.mapf=tmap;
        }
        
        @Override
        public int compare(Integer x,Integer y){
            int freq=mapf.get(y).compareTo(mapf.get(x));
            int value=x.compareTo(y);
            if (freq == 0) 
            return value; 
            else
            return freq;
        }
    }
}