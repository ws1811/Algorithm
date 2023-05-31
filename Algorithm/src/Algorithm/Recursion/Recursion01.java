package Algorithm.Recursion;

public class Recursion01 {
	//recursion 이 무한루프에 빠지지 않으려면? -> 2 가지 조건 만족
	public static void func(int k) {
		if(k<=0) return; // Base Case : 적어도 하나의 recursion 에 빠지지 않는 경우가 졵재해야 한다
		else {
			System.out.println("Hello...");
			func(k-1); // Recursive case : recusrion을 반복하다보면 결국 base case로 수렴해야 한다
		}
	}
	
	public static int func2(int n) {
		if(n<=0) {
			return 0;
		}else {
			System.out.println("Hello.....");
			return n + func2(n-1);
		}
	}
	
	
	

	public static void main(String[] args) {
		func(4);
		int result = func2(4);
		System.out.println(result);
	}

}
