
public class Test4 {

	public static void main(String[] args) {
		int cnt = 0;
		while(true) {
		int a = (int) (Math.random()*6)+1;
		int b = (int) (Math.random()*6)+1;
		cnt ++;
			if((a+b) == 5) {
				System.out.println("�ֻ����� "+cnt+"�� ������ �� ���� ���� 5�� �Ǿ����ϴ� ");
				break;
			}
		}
	}

}
