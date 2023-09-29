package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class B2745 {
  //2745 - 진법변환
	
	/*
	B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
	10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
	A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
	*/
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//첫째 줄에 N과 B가 주어진다((2 ≤ B ≤ 36)
		int n = scan.nextInt();
		int b = scan.nextInt();
		int result = 0;
		
		String str = Integer.toString(n); // 정수 n을 문자열 str로 변환	
		int len = str.length();
		try {
			for(int i=len; i>0;i--) {
				int a = Integer.parseInt(str.substring(i));
				
				if(a < 10) {
					//10진법을 넘어가지 않는 경우
					result += a * b^(len-i);
				}else {
					//10진법을 넘어가는 경우 (A:10, B:11, ... , Z:35)
					for(char c='A'; c<='Z';c++) {
						
					}
				}
							
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
	}
}
