
public class MinimumCostPath {

	static int min(int a, int b, int c) {
		int smallest;
		if (a < b && a < c) {
			smallest = a;
		} else if (b < c && b < a) {
			smallest = b;
		} else {
			smallest = c;
		}
		return smallest;
	}

	static int MCS(int[][] cost, int m, int n) {
		int tc[][] = new int[m + 1][n + 1];
		tc[0][0] = cost[0][0];
		for (int i = 1; i <= m; i++) {
			tc[i][0] = cost[i][0] + tc[i - 1][0];
		}
		for (int j = 1; j <= n; j++) {
			tc[0][j] = cost[0][j] + tc[0][j - 1];
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				tc[i][j] = min(tc[i - 1][j], tc[i-1][j-1], tc[i][j - 1]) + cost[i][j];
			}
		}
		return tc[m][n];
	}

	public static void main(String args[]) {
		int cost[][] = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };

		int result = MCS(cost, 2, 2);
		System.out.println(result);
	}

}
