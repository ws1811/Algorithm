package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class B2745 {
  
	// 문자 c 를 정수로 변환
	static int atoi(char c)
	{
		// 0 ~ 9 인 경우
		if (c >= '0' && c <= '9')
		{
			return (c - '0');
		}
		// 10 ~ 36 인 경우
		else if (c >= 'A' && c <= 'Z')
		{
			return (c - 'A' + 10);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//[입력] 첫째 줄에 N과 B가 주어진다((2 ≤ B ≤ 36)
		String n = scan.next();
		int b = scan.nextInt();
		
		int result = 0;// 결과를 저장할 변수
		
		/* 반복문에 사용할 변수 */
		int i = n.length() - 1; // 문자열 N 의 마지막 인덱스부터 계산할 것임
		char c; // 문자열의 N 의 각 문자를 보관할 변수
		int exp = 0; // 거듭제곱 연산시 지수로 사용될 변수
		
		while (i >= 0)
		{
			c = n.charAt(i); // i 번째 문자 (뒤에서부터 시작)
			// result += (해당 문자가 B진법에서 가리키는 숫자) * (B 의 exp 승)
			result += atoi(c) * Math.pow(b, exp);
			exp++;
			i--;
		}		
		System.out.println(result);
	}
}
