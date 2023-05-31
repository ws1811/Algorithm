package Algorithm.Recursion;

public class Recursion04 {
	// Designing recursion - 순환적 알고리즘 설계
	/*	1. 적어도 하나의 base case, 즉 순환되지 않고 종료되는 case가 있어야 함
	 *  2. 모든 case 는 결국 base case 로 수렴해야 함
	 *  
	 *  암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꿔라?
	 */
	
	// 순차 탐색(pseudo code)
	int search(int[] data, int n, int target) { 
		for(int i=0;i<n;i++) {
			if(data[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	//순차 탐색 - recursion으로 구현
	int searchRecursion(int[] data, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		}else if(target== data[begin]){
			return begin;
		}else {
			return searchRecursion(data, begin+1, end, target);
		}
	}
	
	public static void main(String[] args) {
		
		

	}

}
