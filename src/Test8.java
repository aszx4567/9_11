public class Test8 {
	public static void main(String[] args) {
		String var1 = new String("ȫ�浿");
		String var2 = new String("ȫ�浿");
		
		if(var1 == var2) {
			System.out.println("var1 �� var2�� ������ġ�� ����.");
		}else {
			System.out.println("var1 �� var2�� ������ġ�� �ٸ���.");
		}
		
		if(var1.equals(var2)) {
			System.out.println("var1 �� var2�� ���� ����.");
		}else {
			System.out.println("var1 �� var2�� ���� �ٸ���.");
		}
	}
}
