import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("==========================");
			System.out.println("| 1. ���� | 2. ��� | 3. �ܰ� | 4. ���� |");
			System.out.println("==========================");
			int num = scan.nextInt();
			if(num == 1) {
				System.out.println("������ ���� �Է��ϼ���");
				balance += scan.nextInt();
				System.out.println("���ݵǼ˽��ϴ� �ܰ�Ȯ���� 3���� ���ؼ� ���ּ��� ����");
			}else if(num == 2){
				
			}
			
		}
	}

}
