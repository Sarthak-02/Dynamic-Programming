//The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order. For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.

//time complexity of nlogn
public class LongestIncSubSequence {

	static int CielIndex(int[] a ,int l,int r, int key)
	{
		while(r-l>1)
		{
			int m = l + (r - l)/2;
            if (a[m]>=key)
                r = m;
            else
                l = m;
		}
		return r;
	}
	
	static int Sequence(int[] a , int n)
	{
		int[] tailtable = new int[n];
		int len;//always points empty slot.
		tailtable[0]=a[0];
		len=1;
		for(int i=1;i<n;i++)
		{
			if(a[i]<tailtable[0])
			{
				tailtable[0]=a[i];
			}
			else if(tailtable[len-1]<a[i])
			{
				tailtable[len++]=a[i];
			}
			else
			{
				tailtable[CielIndex(tailtable,-1,len-1,a[i])]=a[i];
			}
		}
		return len;
	}
	
	public static void main(String args[])
	{
		int a[] = { 2, 5, 3};
		int n = a.length;
		int len=Sequence(a,n);
		System.out.println("Length of the Sequence is "+len);
		
	}
}
