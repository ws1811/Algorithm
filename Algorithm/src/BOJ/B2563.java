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
		int[][] white = new int[99][99]; // 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지 - 초기값 null('\0')
		
		//입력
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 검은 색종이의 개수
		int[][] black = new int[99][2]; // 검은 색종이들을 붙인 위치를 저장할 배열(최대100개)
		// 색종이를 붙인 위치 - 정사각형의 좌측 하단 꼭지점의 위치로 주어진다 (X, Y)
		//num 개 만큼 색종이를 붙인 위치 입력받기	
		for(int i=0; i<num;i++) {					
			for(int j=0;j<2;j++) {
				black[i][j] = scan.nextInt();
			}
		}
		
		// black 배열에서 시작점별로 양 변 길이가 10인 정사각형 해당하는 부분의 값을 1로 변경(white배열에서)
		for(int i=0; i<num; i++) {
			int x = black[i][0]; //x좌표
			int y = black[i][1]; //y좌표
			int 
		}
		
		

	}

}
