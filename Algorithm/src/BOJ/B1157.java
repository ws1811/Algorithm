package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class B1157 {

	// 배열 {A, B, C, ... , Z} 생성
	static char[] initAlpha()
	{
		char[] alpha = new char[26];
		char letter = 'A';
		int i = 0;
		
		while (letter <= 'Z')
		{
			alpha[i] = letter;
			System.out.printf("## alpha[%d] = %c\n", i, alpha[i]);
			i++;
			letter++;
		}		
		return alpha;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		int i;
		
		// [입력] 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다
		str = scan.next();
		// [출력] 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다
		// 단, 결과가 여러개인 경우 ? 를 출력한다
		char[] alpha = initAlpha();
		i = 0;
		while (true)
		{
			
		}
	}

}
