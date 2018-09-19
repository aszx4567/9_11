
public class Test4 {

	public static void main(String[] args) {
		int cnt = 0;
		while(true) {
		int a = (int) (Math.random()*6)+1;
		int b = (int) (Math.random()*6)+1;
		cnt ++;
			if((a+b) == 5) {
				System.out.println("주사위의 "+cnt+"번 굴려서 두 수의 합이 5가 되었습니다 ");
				break;
			}
		}
	}

}
