import java.util.Arrays;
import java.util.Stack;

public class MaxSizeRectangleOfAll1 {
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
	
	static int maxRect(int[][] a){
		int[] area = new int[6];
		//int temparea=0;
		int maxArea=0;
		Arrays.fill(area, 0);
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				//System.out.print(a[i][j]);
				if(a[i][j]==0){
					area[j] = 0;
				}
				else
				{
					area[j]+=a[i][j];
				}
			}
			//System.out.println();
			if(maxArea <getMaxArea(area,6) ){
				maxArea = getMaxArea(area,6);
			}
			
		}
		return maxArea;
	}
	public static void main(String args[]){
		int[][] a = {{1,0,0,1,1,1},
				{1,0,1,1,0,1},
				{0,1,1,1,1,1},
				{0,0,1,1,1,1}};
		System.out.println(maxRect(a));
		}
	}

