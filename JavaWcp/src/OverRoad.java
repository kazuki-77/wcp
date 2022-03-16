
public class OverRoad {
	// 1つ目のaddメソッド
	public static int add(int x,int y) {
		return x + y;
	}
	// 2つ目のaddメソッド
	public static double add(double x, double y) {
		return x + y;
	}
	//　3つ目のaddメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello", "World"));
	}
	// 仮引数の型は1つ目[int,int],2つ目[double,double],3つ目[String,String]とそれぞれ異なっている
	// オーバーロードとは
	// 仮引数が異なれば同じ名前のメソッドを複数が許されている。
	// 同じ名前のメソッドが複数あったとしても、仮引数の方が異なっていれば、その引数の方に一致するメソッドを呼び出してくれる。
	// 仮引数の方だけでなく、個数が違う場合もオーバーロードできる。
	/* (例)
	 public class Main {
	  　1つ目のメソッド
	 	public static int add(int x, int y) {　
	 		return x + y;
	 	}
	 	2つ目のメソッド
	 	public static int add(int x, int y, int z) {　
	 		return x + y + z;
	 	}
	 	public static void main(String[] args {
	 		System.out.println("10+20=" + add(10, 20)); 1つ目のメソッドが呼び出される
	 		System.out.println("10+20+30=" + add(10,20,30)); 2つ目のメソッドが呼び出される
	 	}
	 }
	 
	 実行結果
	 	10+20=30
	 	10+20+30=60
	  */
	
	 //　メソッドのシグネチャ
	 // 引数の個数や型とその並び順の情報をまとめて、メソッドのシグネチャ(signature)という。（戻り値は含まれない)
	 // 下記の『　』の部分がシグネチャ
	 // public static int 『 add(int x, int y)』
	 // オーバーロードはシグネチャが重複しない場合のみ許される
}
