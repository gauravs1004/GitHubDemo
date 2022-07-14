
public class Test1 {

	public static void main(String[] args) {

		String name = "Welcome";
		System.out.println(name.charAt(0));
		int leng = name.length();

		String rev = "";
		for (int i = leng - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}

		System.out.println(rev);
	}

}
