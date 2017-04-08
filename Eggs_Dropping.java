//http://www.geeksforgeeks.org/dynamic-programming-set-11-egg-dropping-puzzle/




public class Egg_Dropping {

	static int drops(int eggs, int floors) {
		int[][] dp = new int[eggs + 1][floors + 1];
		for (int i = 1; i <= floors; i++) {
			dp[1][i] = i;
		}
		int c = 0;

		for (int i = 2; i <= eggs; i++) {
			for (int j = 1; j <= floors; j++) {
				dp[i][j] = Integer.MAX_VALUE;
				for (int k = 1; k <= j; k++) {
					c = 1 + Math.max(dp[i - 1][k - 1], dp[i][j - k]);
					if (c < dp[i][j]) {
						dp[i][j] = c;
					}
				}

			}
		}
		return dp[eggs][floors];
	}

	public static void main(String args[]) {
		int floors = 6;
		int eggs = 2;
		int answer = drops(eggs, floors);
		System.out.println(answer);
	}
}
