public class Test10 {
	public static void main(String[] args) {
		int tot = 0;
		if(args.length < 2) {
			System.out.println("���α׷��� �����մϴ�");
		}else {
			for( int i = 0; i < args.length; i++) {
			tot += Integer.parseInt(args[i]);
			System.out.println((i+1)+"="+args[i]);
			}		
			System.out.println("��ü���� = "+tot);
		}
	}//end main
}//end class
