package BOJ;

import java.util.Scanner;

public class BOJ_2675 {

	public static void repeatLetter(char c, int r)
	{
		int i = 0;
		while (i < r)
		{
			System.out.print(c);
			i++;
		}		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String	s;
		int t, r, i;
		t = scan.nextInt(); // test case 개수
		while(t > 0)
		{
			r = scan.nextInt(); // 반복회수
			s = scan.next(); // 입력받을 문자열
			i = 0;
			while (i < s.length())
			{
				repeatLetter(s.charAt(i), r);				
				i++;
			}
            System.out.println();//줄바꿈
			t--;
		}	

	}

}
