// Take 2 String check whether they are equals or not without using equals method

package p1;

public class Test2 {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "java";

		if (str1.length() != str2.length()) {
			System.out.println("Not Equals");
			return;
		}

		boolean isEquals = true;

		for (int i = 0; i < str1.length(); i++) {

			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);

			if (ch1 != ch2) {
				isEquals = false;
				break;
			}
		}

		if (isEquals) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

	}

}
