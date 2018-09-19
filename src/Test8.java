public class Test8 {
	public static void main(String[] args) {
		String var1 = new String("홍길동");
		String var2 = new String("홍길동");
		
		if(var1 == var2) {
			System.out.println("var1 과 var2의 참조위치는 같다.");
		}else {
			System.out.println("var1 과 var2의 참조위치는 다르다.");
		}
		
		if(var1.equals(var2)) {
			System.out.println("var1 과 var2의 값은 같다.");
		}else {
			System.out.println("var1 과 var2의 값은 다르다.");
		}
	}
}
