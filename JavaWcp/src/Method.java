
public class Method {
	public static void methodA() {
		System.out.println("methodA");
		methodB(); // methodB　メソッドの呼び出し
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		methodA(); // methodA メソッドの呼び出し
	}
	// mainメソッドより上に別のメソッドが定義されていても、プログラムは必ずmainメソッドから動き始める
	// 今回であれば main() → methodA() → methodB()の順に実行されている
	// 呼び出し方の基本は『メソッド名()』で呼び出す。
}


