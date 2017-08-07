//http://www.geeksforgeeks.org/choose-maximum-weight-given-weight-value-ratio/

import java.awt.Point;
import java.util.*;
public class MaxWeightValueRatio {
	static int maxWeightrec(int[] wt, int[] val,int k,HashMap<Point,Integer> hm,int last,int diff) {
		if(last == -1) {
			if(diff==0) {
				return 0;
			}
			else
			{
				return Integer.MIN_VALUE;
			}
		}
		
		Point tmp = new Point(last,diff); //pair of last chosen item and difference.
		//System.out.println(hm.get(tmp));
		if(hm.containsKey(tmp)) {
			return hm.get(tmp);
		}
		
		hm.put(tmp, Math.max(maxWeightrec(wt,val,k,hm,last-1,diff),wt[last]+
				maxWeightrec(wt,val,k,hm,last-1,diff + wt[last] - k*val[last])));
		return hm.get(tmp);
	}
	static int maxWeight(int[] wt,int[] val,int k,int N) {
		HashMap<Point,Integer> hm = new HashMap<>(); //what is this point ?
		return maxWeightrec(wt,val,k,hm,N-1,0);
	}
	public static void main(String[] args) {
		int[] wt = {4,8,9};
		int[] val = {2,4,6};
		
		int k=2;
		System.out.println(maxWeight(wt,val,k,wt.length));
		
		
	}
}
