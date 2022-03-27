class Sample1_08_3 {
	public static void main (String[] args) {
		
		//コマンドライン引数の活用
		// コマンドライン引数はコマンドライン(コマンドプロンプトの行のこと)を通して
		// 人間から受け取る特殊な配列のこと。
		// コマンドプロンプト上でプログラム実行命令
		// 『java クラス名』を打ち込んだ後に、半角スペース区切りでデータを入力すると
		// JVMがそれらをString型配列に詰めて実行先のプログラムに渡してくれる
		// この配列の名前はargsと定められており、プログラムの処理開始と同時に使用開始な状態になっている
		
		String x = args[1] ;
		System.out.println("コマンドライン引数の要素の参照：" + x );
		
		int count = args.length ;
		System.out.println("コマンドライン引数の要素数：" + count );
		
	}
}
