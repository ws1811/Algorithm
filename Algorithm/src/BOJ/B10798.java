package BOJ;

import java.util.Scanner;

public class B10798 {

	 /*
	 [입력]
	 총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다. 
	 주어지는 글자는 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’ 중 하나이다.  
	 각 줄의 시작과 마지막에 빈칸은 없다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] cWord = new char[5][15];
		int max = 0;	// 입력받는 문자열 중 가장 긴 문자열의 길이

		for(int i=0; i<5; i++) {
			String str = scan.next();
			max = Math.max(max, str.length());	// 가장 긴 문자열 체크
			for(int j=0; j<str.length(); j++)
				cWord[i][j] = str.charAt(j);
		}

		for(int i=0; i<max; i++) {
			for(int j=0; j<5; j++) {
				if(cWord[j][i] == '\0')	//  '\0' = null
					continue;
				System.out.print(cWord[j][i]);
			}
		}
		scan.close();
	}
}
