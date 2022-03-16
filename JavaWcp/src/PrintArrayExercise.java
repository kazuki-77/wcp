
public class PrintArrayExercise {
	public static void main(String[] args) {
		introduceOneself();
		
		String title = "タイトル";
		String adress = "sample@example";
		String text = "本文";
		email(title, adress, text);
		
		String address = "test@test";
		email(address,text);
	}
	public static void introduceOneself() {
		String name = "湊";
		int age = 22;
		double height = 165.2;
		char zordic = '酉';
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "kgです");
		System.out.println("干支は" + zordic + "です");
		
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println(triangleArea);
		
		double circleArea = calcCircleArea(5.0);
		System.out.println(circleArea);
		
	}
	public static void email(String title, String adress, String text) {
		System.out.println(adress + " に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
