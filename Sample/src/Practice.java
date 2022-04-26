
public class Practice {
	public static void main(String[] args) {
		String num = "";
		for(int i = 1; i < 10; i++) {
			num = "";
			for(int j = 1; j < 10; j++) {
				num = num + j * i + " ";
			}
			System.out.println(num);
		}
	}
}