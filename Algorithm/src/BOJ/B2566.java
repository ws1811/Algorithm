package BOJ;

import java.util.Scanner;

public class B2566 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[9][9]; // 9 x 9 배열
		int max = 0; //최대값 담을 변수	
		int maxRow = 1;
		int maxCol = 1;
		for(int row=0;row<9;row++) {
			for(int col=0; col<9; col++) {
				arr[row][col] = scan.nextInt(); 
				if(arr[row][col] > max) {
					max = arr[row][col];
					maxRow = row+1;
					maxCol = col+1;
				}
			}
		}
		System.out.println(max);
		System.out.printf("%d %d", maxRow, maxCol);
	}

}
