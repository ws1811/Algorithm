package BOJ;

import java.util.Scanner;

public class B2908 {

	// 0이 포함되지 않은 세 자리 정수를 뒤집는 메소드
	static int revInt(int n)
	{
		int result;		
		int first, second, third;
		
		result = 0;
		first = n / 100;  // 첫째 자리
		second = (n - first * 100) / 10;  // 둘째 자리
		third = n % 10;	  // 셋쨰 자리
		
		result += third * 100;
		result += second * 10;
		result += first;
		
		return (result);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b; //세 자리 정수

		a = scan.nextInt();
		b = scan.nextInt();
		// 각 정수 a, b 뒤집기
		a = revInt(a); 
		b = revInt(b);
		
		if (a >= b)
			System.out.println(a);
		else
			System.out.println(b);
	}

}
