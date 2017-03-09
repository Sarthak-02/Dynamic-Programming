
public class CoinChanging1 {

	static int CC(int a[],int total)
	{
		int n = a.length;
		int t[][]=new int[n][total+1];
		t[0][0]=1;
		for(int i=1;i<=total;i++)
		{
			t[0][i]=1;
		}
		for(int i=1;i<n;i++)
		{
			t[i][0]=1;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=total;j++)
			{
				if(j>a[i])
				{
					t[i][j]=t[i-1][j]+t[i][j-a[i]];
				}
				else
				{
					t[i][j]=t[i-1][j];
				}
			}
		}
		return t[n-1][total];
		
	}
	
	
	
	
	
	public static void main(String args[])
	{
		int a[] = {1,2,3};
		int total =5;
		int result=CC(a,total);
		System.out.println(result);
	}
}
