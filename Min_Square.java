import static java.lang.System.out;
public class Min_Square {
//http://www.geeksforgeeks.org/minimum-number-of-squares-whose-sum-equals-to-given-number-n/
	static int find_Sum(int n)
	{
		if(n<4)
		{
			return n;
		}
		int res = n;// all 1's
		int x = (int) Math.sqrt(n);
		for(int i=x;i>=1;)
		{
			if(n-x*x==0)
			{
				return 1;
			}
			else
			{
				return 1+Math.min(find_Sum(n-x*x),res);
			}
		}
		return res;
	}
	public static void main(String args[])
	{
		int n = 17;
		
		int res= find_Sum(n);
		out.println(res);
	}
}
