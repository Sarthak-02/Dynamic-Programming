reference: tushar roy knapsack dynamic programming



public class Knapsack {
	static int max(int a , int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}

	static int KS(int[] val,int[] wt,int w)
	{
		int m = val.length;
		int n = wt.length;
	int t[][] = new int[m][w+1];
	for(int i=0;i<m;i++)
	{
		t[i][0]=0;
	}
	for(int i=0;i<=w;i++)
	{
		if(i>=wt[0])
		{
			t[0][i]=1;
		}
		else
		{
			t[0][i]=0;
		}
	}
	for(int i=1;i<m;i++)
	{
		for(int j=1;j<=w;j++)
		{
			if(wt[i]>j)
			{
				t[i][j]=t[i-1][j];
				
			}
			else
			{
				t[i][j] = max(val[i]+t[i-1][j-wt[i]],t[i-1][j]);
			}
		}
	}
	return t[n-1][w];
	}
	
	
	
	
	public static void main(String args[])
	{
		int val[] = new int[]{1,4,5,7};
	    int wt[] = new int[]{1,3,4,5};
	    int  w = 7;
	    int n = val.length;
	    int result=KS(val,wt,w);
	    System.out.println(result);
	}
}
