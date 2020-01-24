class largeNum
{
    public static void swap(char[] c, int i, int j) {
    char ch = c[i];
    c[i] = c[j];
    c[j] = ch;
}
public static int findMaximum(char[] c, int n, int k, int maxSoFar)
{
    String s = new String(c);
		if(s.compareTo(String.valueOf(maxSoFar)) > 0) {
			maxSoFar = Integer.valueOf(s);
		}
		if (k < 1) {
			return maxSoFar;
		}
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (c[i] < c[j])
				{
					swap(c,i,j);
					maxSoFar=findMaximum(c,n,k-1,maxSoFar);
					swap(c,i,j);
				}
			}
		}
		return maxSoFar;
	}

	public static void main(String[] args)
	{
		int i=7346591;
		int k=2;
		char[] ch = String.valueOf(i).toCharArray();
		int minimum = findMaximum(ch, ch.length, k, i);
		System.out.println(minimum);
	}
}