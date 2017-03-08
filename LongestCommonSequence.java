

//https://en.wikipedia.org/wiki/Longest_common_subsequence_problem . Visit it's wikipedia page for explanation

public class LongestCommonSequence {

	static String LCS(String s1, String s2) {

		String x,y;
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 == 0 || len2 == 0) {
			return "";
		} else if (s1.charAt(len1 - 1) == s2.charAt(len2 - 1)) {
			return LCS(s1.substring(0, len1 - 1), s2.substring(0, len2 - 1)) + s1.charAt(len1 - 1);
		} else {
			x = LCS(s1, s2.substring(0, len2 - 1));
			y = LCS(s1.substring(0, len1 - 1), s2);
			return ((x.length() > y.length()) ? x : y);
		}

	}

	public static void main(String args[]) {
		String s1 = "banana";
		String s2 = "atana";

		String Sequence = LCS(s1, s2);
		System.out.print(Sequence);
	}
}
