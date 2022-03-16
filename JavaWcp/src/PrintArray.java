
public class PrintArray {
	// 引数に配列を用いる
	// int型配列を受け取り、全ての要素を表示するメソッド
	public static void printArray(int[] array) { // 引数に配列型を指定
		for (int element : array) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array); // 配列を渡す
		
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++ ) {
			array[i]++;
		}
	}
}
