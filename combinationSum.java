import java.util.ArrayList;
import java.util.*;

class combinationSum{
    public static List<List<Integer>> prob(int arr[],int n){
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(arr);
        backtrackSum(res,list,arr,n,0);

        return res;
    }

    public static int backtrackSum(List<List<Integer>> res,
    List<Integer> list, int arr[], int n,
    int pos){
        int sum=0;
        for(int x: list){
            sum=sum+x;
        }
        if(sum==n){
            res.add(new ArrayList<Integer>(list));
        }
        else{
            for (int i=pos;i<arr.length-1;i++)
                {
                    if(pos!=i
                        && arr[i]==arr[i-1])
                    {
                        continue;
                    }
                    list.add(arr[i]);
                    backtrackSum(res,list,arr,n,i+1);
                    list.remove(list.size()-1);
                }

        }
        return 0;
    }
    public static void main(String[] args){
        int arr[]={2,6,3,4,5,2,9};
        System.out.println(prob(arr,10));
    }
}
