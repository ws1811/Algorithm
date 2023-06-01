package BOJ;

import java.util.Scanner;

public class B2563 {
	/*
	 첫째 줄에 색종이의 수가 주어진다. 
	 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 
	 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 
	 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 
	 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다
	 */
	
	
	public static void main(String[] args) {
		int[][] arr = new int[100][100];
		int area = 0;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 색종이의 개수
		for(int i=0; i<num; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			for(int a=x; a<x+10; a++) {
				for(int b=y; b<y+10;b++) {
					if(arr[a][b] != 1) {
						arr[a][b] = 1;
						area++;
					}
				}
			}
		}
		System.out.println(area);
	}

}
