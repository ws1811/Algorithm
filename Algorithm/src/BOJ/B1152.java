package BOJ;

import java.util.Scanner;

public class B1152 {
	
	public static int countWord(String str, int i)
	{
		if (str.charAt(i) != ' ' && str.charAt(i + 1) == ' ')
			return (1);
		return (0);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i, count;
		String str;
		
		i = 0;
		count = 0;
		// 입력
		str = scan.nextLine();
		while (i + 1 < str.length())
		{
			if (countWord(str, i) == 1)
				count++;
			i++;
		}
		if (str.charAt(str.length() - 1) != ' ')
			count++;
		System.out.println(count);
	}
}
