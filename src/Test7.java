import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("==========================");
			System.out.println("| 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 |");
			System.out.println("==========================");
			int num = scan.nextInt();
			if(num == 1) {
				System.out.println("예금할 돈을 입력하세요");
				balance += scan.nextInt();
				System.out.println("예금되셧습니다 잔고확인은 3번을 통해서 해주세요 ㅎㅎ");
			}else if(num == 2){
				
			}
			
		}
	}

}
