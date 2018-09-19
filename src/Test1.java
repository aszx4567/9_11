
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot = 0;
		int i =0;
		for( i  = 0 ; i<101; i++) {
			tot += i;
		if(i%10 == 0) {
				System.out.println("1~"+i+"="+tot);
			}
		}
		int j = 0;
		int sum = 0;
		while(i<=100) {
			i++;
			tot +=j;
			if((1%10)==0)
				System.out.println("1~"+j+"="+sum);
		}
		
		

	}

}
