package coding_basic;

public class Fibonacci {	 
	// 피보나치 수열 ex\) 1, 1, 2, 3, 5, 8
	//1, 0+1:1, 1+1:2, 1+2:3, 2+3:5 ~~
	public static void main(String[] args) {
		int input = 5;
		System.out.println(input);
		// 기초
		System.out.println(fibonacciBasic(input));
		
		System.out.println(fibonacciAnother(input));
		
	
				
	}
	
	// 재귀함수 구현
	// 1번 풀이 : 간단하지만 성능상의 문제가 있다.
	private static int fibonacciBasic(int n) {
		if(n <= 1) {
			return 1;
		}else {
			return fibonacciBasic(n-1) + fibonacciBasic(n-2);
		}		
	}
	
	// 2번 풀이: 동적 프로그래밍 기법을 활용.
	private static int fibonacciAnother(int n) {
		int first = 0;
		int second = 0;
		int result = 0;
		
		if(n<=1) {
			return 1;
		}
		
		first = 1;
		second = 1;
		
		for(int i=1; i < n; i++) {
			result = first + second;
			first = second;
			second = result;
		}
		 
		return result;
	}
}
