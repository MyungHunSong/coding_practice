package coding_basic;

public class Fact {
	// 재귀 호출 (나자신을 호출한다)
	public static void main(String[] args) {
		// 5라면 5x4-> 5x4x3 -> 5x4x3x2 -> 5x4x3x2x1 -> 120
		// n * f(n-1) = all f(n) mul
		int input = 5;
		
		System.out.println(input);
		System.out.println(fact(input));
		
	}

	public static int fact(int n) { 
		if(n <= 1) {
			return n;
		}else {
			return n * fact(n-1);			
		}		
		
		// 첫 호출이된 f(5)는 종료 되지 않고 Stack에 쌓인상태로, fact(5)가 호출한 fact(4)이 실행된다
		// stack f(2), f(3), f(4), f(5) 쌓여 있음
		// 5*4 -> 4*3 -> 3*2 -> 2*1 => 호출  => 2*1 쌓임 ->3*2-> 4*6 -> 5*24 결국 5*4*3*2*1된다.
	}
}
