package Algorithm.Recursion;

import java.util.Arrays;

public class Maze {

	/*
	 현재 위치에서 출구까지 가는 경로가 있으려면
	 1) 현재 위치가 출구이거나 or
	 2) 이웃한 셀들 중 하나에서 현재 위치를 지나지 않고 출구까지 가는 경로가 있거나 
	 */ 
	
	private static int N=8; //미로 한변의 길이
	private static int[][] maze= {
			{0, 0 , 0, 0, 0, 0, 0, 1},
			{0, 1 , 1, 0, 1, 1, 0, 1},
			{0, 0 , 0, 1, 0, 0, 0, 1},
			{0, 1 , 0, 0, 1, 1, 0, 0},
			{0, 1 , 1, 1, 0, 0, 1, 1},
			{0, 1 , 0, 0, 0, 1, 0, 1},
			{0, 0 , 0, 1, 0, 0, 0, 1},
			{0, 1 , 1, 1, 0, 1, 0, 0}
	};
	private static void printMaze() {
		 for(int i=0; i<maze.length;i++) {
			 System.out.println(Arrays.toString(maze[i]));
		 }
	}
	private static final int PATHWAY_COLOUR = 0; //white
	private static final int WALL_COLOUR = 1; //blue (벽)
	private static final int BLOCKED_COLOUR = 2; // red(꽝, 가본 셀 중 이 쪽으로는 출구로 가는 길이 없다)
	private static final int PATH_COLOUR = 3; // green(방문한 셀 -> 확실하게 판정이 안된 경우 -> 아님이 밝혀졌을 때 red로)
	
	
	public static boolean findMazePath(int x, int y) { //현재 좌표(x, y)
		if(x<0 || y<0 || x>=N || y>=N) {//좌표가 미로를 벗어나는 경우 false를 리턴
			return false;
		}
		else if (maze[x][y] != PATHWAY_COLOUR) { //
			return false;
		}
		else if (x==N-1 && y==N-1) {
			maze[x][y] = PATH_COLOUR;
			return true;
		}
		else {
			maze[x][y] = PATH_COLOUR; 
			//인접한 네 개의 셀에 대해 findMazePath 호출
			if(findMazePath(x-1,y)|| findMazePath(x,y+1) || findMazePath(x+1,y) || findMazePath(x, y-1)) {
				return true;
			}
			maze[x][y] = BLOCKED_COLOUR; //dead end(꽝)
			return false;
		}
	}
	
	public static void main(String[] args) {
		printMaze();
		findMazePath(0,0);
	}

}
