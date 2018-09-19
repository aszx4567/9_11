//1부터 100 까지의 3의 배수의 총합
public class Test {

	public static void main(String[] args) {
		   int tot = 0;
		   int i =0;
		  for( i = 0; i <=100 ; i++) {
			  i += 3;
			  tot += i;
		  }
		  System.out.println(tot);
		   
	}

}
