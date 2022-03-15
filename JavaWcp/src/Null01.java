
public class Null01 {
	public static void main(String[] args) {
		String string1;
		// "あいう"の文字列を出力
		string1 = "あいう";
		System.out.println(string1 + "文字数:" + string1.length());
		// ""(空文字)の文字数を出力
		string1 = "";
		System.out.println(string1 + "文字数:" + string1.length());
		// nullの変数を参照するとNullPointerExceptionエラー
		string1 = null;
		System.out.println(string1 + "文字数:" + string1.length());
		
		int[] array1 = new int[3];
		array1[0] = 60;
		array1[1] = 20;
		array1[2] = 20;
		int int2 = array1[2];
		
		int array2[] = null;
	}
}
