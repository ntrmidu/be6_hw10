package be6_hw10;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] string = { "flow", "flower", "floor" };
		
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
		
		System.out.println("The longest common prefix is " + longestCommonPrefix(string));

	}

	public static String longestCommonPrefix(String[] string) {
		if (string.length == 0) {
			return "";
		}

		String stringAtIndex0 = string[0];
		for (int i = 0; i < stringAtIndex0.length(); i++) {
			for (int j = 1; j < string.length; j++) {
				if (i == string[j].length() || string[j].charAt(i) != stringAtIndex0.charAt(i)) {
					return stringAtIndex0.substring(0, i);
				}
			}
		}

		return stringAtIndex0;
	}

}
