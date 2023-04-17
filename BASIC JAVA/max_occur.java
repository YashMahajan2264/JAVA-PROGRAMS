
public class max_occur {
	static final int ASCII_SIZE = 256;
	static char getMaxOccurringChar(String str)
	{
		int count[] = new int[ASCII_SIZE];

		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1; // Initialize max count
		char result = ' '; 
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}

	// Driver Method
	public static void main(String[] args)
	{
		String str = "sample string";
		System.out.println("Max occurring character is "
						+ getMaxOccurringChar(str));
	}
}
