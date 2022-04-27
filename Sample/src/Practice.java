
public class Practice {
	public static void main(String[] args) {
		String num = "";
		for(int i = 1; i < 10; i ++) {
			num = "";
			for( int a = 1; a < 10; a++) {
				num = num + a * i + " ";
			}
			System.out.println(num);
		}
	}
}