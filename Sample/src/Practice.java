
public class Practice {
	public static void main(String[] args) {
			System.out.println("あなたの運勢を占います");
			System.out.println("1〜5の中で好きな数字を入力してください");
			int fortune = new java.util.Scanner(System.in).nextInt();
			switch(fortune) {
			case 1:
				System.out.println("大吉");
				break;
			case 2:
				System.out.println("中吉");
				break;
			case 3:
				System.out.println("小吉");
				break;
			case 4:
				System.out.println("吉");
				break;
			}
			
	}
}
