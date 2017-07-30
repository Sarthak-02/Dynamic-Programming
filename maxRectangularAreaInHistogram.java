import java.util.*;
public class maxRectangularAreainHistogram {
	
	static int getMaxArea(int[] hist,int len){
		Stack<Integer>  s = new Stack<Integer>();
		int area =0;
		int maxArea=-1;
		int top;
		int i=0;
		//s.push(0);
		while(i<len){
			

			if(s.empty() || hist[s.peek()]<=hist[i]){  
				//System.out.println(area);
				s.push(i);
				
				i++;
			}
			else
			{
				
					 top = s.pop();
					if(s.isEmpty()){
						area = hist[top]*i;
					}else
					{
						area = hist[top]*(i-s.peek()-1);
					}
					//System.out.println(area);
					if(maxArea<area){
						maxArea = area;
					}
				}
				
			}
						
			
		
//System.out.println(s);
		while(!s.isEmpty()){
			top = s.pop();
			if(s.isEmpty()){
				area = hist[top]*i;
			}
			else
			{
				area = hist[top]*(i-s.peek()-1);
			}
			
			if(area>maxArea){
				maxArea = area;
			}
		}
		
		return maxArea;
	}
	
	public static void main(String[] args){
		int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
	}
}
