import java.io.*;
import java.util.*;
public class zombie {
public ArrayList<ArrayList<Integer>> zombie12(ArrayList<ArrayList<Integer>> grid)
{
int i,j,count=0;
for (i=0;i<grid.size();i++)
{
for(j=0;j<grid.get(i).size();j++)
{
if(grid.get(i).get(j)==1)
{
if(j==0)
{
//replace right, down,up
if(i==0)
{
if(grid.get(i).get(j+1)==0)
    grid.get(i).set(j+1, 2);
if(grid.get(i+1).get(j)==0)
    grid.get(i+1).set(j,2);
//replace right, down
}
else if(i==grid.size()-1)
{
if(grid.get(i).get(j+1)==0)
    grid.get(i).set(j+1, 2);
if(grid.get(i-1).get(j)==0)    
    grid.get(i-1).set(j,2);
//replace right,up
}
else
{
if(grid.get(i).get(j+1)==0)
grid.get(i).set(j+1, 2);
if(grid.get(i+1).get(j)==0)
grid.get(i+1).set(j,2);
if(grid.get(i-1).get(j)==0)
grid.get(i-1).set(j,2);
}

}
else if(j==grid.get(i).size()-1)
{
//replace left,down,up
if(i==0)
{
if(grid.get(i).get(j-1)==0)
grid.get(i).set(j-1, 2);
if(grid.get(i+1).get(j)==0)
grid.get(i+1).set(j,2);
//replace left, down
}
else if(i==grid.size()-1)
{
if(grid.get(i).get(j-1)==0)
grid.get(i).set(j-1, 2);
if(grid.get(i-1).get(j)==0)
grid.get(i-1).set(j,1);
//replace left,up
}
else
{
if(grid.get(i).get(j-1)==0)
grid.get(i).set(j-1, 2);
if(grid.get(i+1).get(j)==0)
grid.get(i+1).set(j,2);
if(grid.get(i-1).get(j)==0)
grid.get(i-1).set(j,2);
}

}
else if(j!=0 && i!=0 && j!=grid.get(i).size()-1 && i!=grid.size()-1){
    if(grid.get(i).get(j-1)==0)
    grid.get(i).set(j-1, 2);
    if(grid.get(i+1).get(j)==0)
    grid.get(i+1).set(j,2);
    if(grid.get(i-1).get(j)==0)
    grid.get(i-1).set(j,2);
    if(grid.get(i).get(j+1)==0)
    grid.get(i).set(j+1, 2);
}

}



}
}
return grid;
}
public static void main(String args[])
{
try
{
//ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
ArrayList<ArrayList<Integer>> inner = new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
ArrayList<Integer> ArrayList3 = new ArrayList<Integer>();
ArrayList<Integer> ArrayList4 = new ArrayList<Integer>();
       
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        ArrayList1.add(1);
        ArrayList1.add(0);
        ArrayList1.add(1);
        ArrayList1.add(0);
        ArrayList1.add(1);
        ArrayList2.add(0);
        ArrayList2.add(1);
        ArrayList2.add(0);
        ArrayList2.add(1);
        ArrayList2.add(0);
        ArrayList3.add(0);
        ArrayList3.add(0);
        ArrayList3.add(0);
        ArrayList3.add(0);
        ArrayList3.add(1);
        ArrayList4.add(0);
        ArrayList4.add(1);
        ArrayList4.add(0);ArrayList4.add(0);ArrayList4.add(0);
        outer.add(ArrayList1);
        outer.add(ArrayList2);
        outer.add(ArrayList3);
        outer.add(ArrayList4);
       

zombie z=new zombie();
inner=z.zombie12(outer);
System.out.println(inner);

}
catch(Exception e)
{
e.printStackTrace();
}


}
}