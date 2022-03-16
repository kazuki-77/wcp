
public class Return {
	// 戻り値とは
	// 呼び出されたメソッドから、呼び出し元のメソッドへ値を返すことを「値を戻す(値を返す)」という
	// 戻される値のことを「戻り値(返り値)」という
	
	// 値の戻し方
	// public static 戻り値の型 メソッド名(引数リスト) {
	//	メソッドが実行された時に動く処理
	//	return 戻り値;
	// }
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
	}
}
