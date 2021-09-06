package coding_basic;
 
public class GuGuDan {
	
	public static void main(String[] args) {
		
		int temp = 0;
		int lowTemp = 0;
		int mul = 0;
		
		for(int i=2; i<20; i++) {
			temp = i;
			for(int j=1; j<10; j++) { 
				lowTemp = j;
				mul = i*j;
				System.out.printf("%d * %d = %d\t", temp, lowTemp, mul);				
			}
			System.out.println();
		}
		
		 
	}
}
