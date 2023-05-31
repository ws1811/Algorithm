package Algorithm.Recursion;

public class Recursion02 {
	
	public static int sum(int n, int[] data) {
		if(n<=0) return 0;
		else {
			return sum(n-1,data) +data[n-1];
		}
			
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		
		System.out.println(sum(3, arr));
	}

}
