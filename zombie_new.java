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
grid.get(i).set(j+1, 1);
grid.get(i+1).set(j,1);
//replace right, down
}
else if(i==grid.get(i).size()-1)
{
grid.get(i).set(j+1, 1);
grid.get(i-1).set(j,1);
//replace right,up
}
else
{
grid.get(i).set(j+1, 1);
grid.get(i+1).set(j,1);
grid.get(i-1).set(j,1);
}

}
else if(j==grid.get(i).size()-1)
{
//replace left,down,up
if(i==0)
{
grid.get(i).set(j-1, 1);
grid.get(i+1).set(j,1);
//replace left, down
}
else if(i==grid.get(i).size()-1)
{
grid.get(i).set(j-1, 1);
grid.get(i-1).set(j,1);
//replace left,up
}
else
{
grid.get(i).set(j-1, 1);
//grid.get(i+1).set(j,1);
grid.get(i-1).set(j,1);
}

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
        ArrayList1.add(0);
        ArrayList1.add(1);
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