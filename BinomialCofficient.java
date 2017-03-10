
public class BinomialCoff {

	static int BC(int n, int k) {
		if (n == k || k == 0) {
			return 1;
		} else {
			return BC(n - 1, k - 1) + BC(n - 1, k);
		}
	}

	public static void main(String args[]) {
		int result = BC(5, 2);
		System.out.println(result);
	}
}
