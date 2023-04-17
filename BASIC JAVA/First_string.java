// Java program to remove duplicate character
// from character array and print in sorted
// order
import java.util.*;

class GFG
{
	static String removeDuplicate(char str[], int n)
	{
		int index = 0;
		for (int i = 0; i < n; i++)
		{

			
			int j;
			for (j = 0; j < i; j++)
			{
				if (str[i] == str[j])
				{
					break;
				}
			}
			if (j == i)
			{
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}

	public static void main(String[] args)
	{
		char str[] = "yashmahajan".toCharArray();
		int n = str.length;
		String sb="yash";
		sb.subs
		System.out.println(removeDuplicate(str, n));
	}
}
