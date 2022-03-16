
public class Method2 {
	public static void main(String[] args) {
		//　1. 引数が一つの場合
		System.out.println("メソッドを呼び出します");
		hello("湊"); // "湊"を渡してhelloメソッドを呼び出す
		hello("朝香"); // "朝香"を渡してhelloメソッドを呼び出す
		hello("菅原"); // "菅原"を渡してhelloメソッドを呼び出す
		System.out.println("メソッドの呼び出しが終わりました");
		
		// 引数が複数の場合
		add(100, 20);
		add(200, 50);
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
	
	// 1.の説明
	// メソッドを呼び出す際、()の中に値を入れておくとその値が引数として呼び出される側のhelloメソッドに渡される
	// 今回の場合、「String name」として文字列変数 name を宣言しており、helloメソッドが呼び出されると
	// name に呼び出し元から引数として渡された値「湊」が自動的に代入され、メソッドブロック内で使用することができるようになる。
	//　結果　「湊さん、こんにちは」と表示される
	
	// 2.の説明
	// 
	// 
	// 
}
