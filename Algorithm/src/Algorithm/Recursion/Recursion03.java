package Algorithm.Recursion;

import java.util.Scanner;
/*
- 모든 순환함수는 반복문(iteration)으로 변경가능
- 그 역도 성립함. 즉 모든 반복문은 recursion으로 표현가능함
- 순환함수는 복잡한 알고리즘을 단순하고 알기 쉽게 표현하는 것을 가능하게 함
- 하지만 호출함수에 따른 오버헤드가 있음(매개변수 전달, 액티베이션 프레임 생성 등) 
 */
public class Recursion03 {
	//Recursion의 기본개념과 예제들(2/3)
	public static void printInBinary(int n) {
		// 음이 아닌 정수 n을 이진수로 반환하여 인쇄한다.
		if(n<2) {
			System.out.print(n);
		}else {
			printInBinary(n/2);
			System.out.print(n%2);
		}
	}
	
	public static int sum(int n, int[] data) {//data[0]에서 data[n-1]까지의 합을 구하여 반환한다
		if(n<=0) {
			return 0;
		}else {
			return sum(n-1,data)+data[n-1];
		}
	}
	
	public static void main(String[] args) {
		printInBinary(11);
		
		
	}
}

