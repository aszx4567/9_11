
public class Test5 {

	public static void main(String[] args) {
		int sum = 0;
		for(int x = 1; x<=10 ; x++) {
			  sum = 60 - (4*x); 
			for(int y = 1; y <= 10 ; y++) {
				if(sum - (5 * y) == 0) {
					System.out.println( x+","+y );
				}
			}
		}
	}

}
