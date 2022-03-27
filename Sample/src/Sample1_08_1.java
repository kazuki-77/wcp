class Sample1_08_1 {
	public static void main (String[] args) {
		
		//配列の活用
		// 型名[] 配列名 = new 型名[要素数];
		// 型名[]の部分を配列宣言という
		// 一つ一つの他所には「インデックス（添字)」と呼ばれる番号が「0」から順に付与される
		// 参照・代入など、要素を使用したい場合は
		// 『配列名「インデックス」』の書式で使用する要素を指定できる
		char[] singou = new char[3] ; // 配列を生み出している場所
		singou[0] = '赤' ;
		singou[1] = '黄' ;
		singou[2] = '青' ;
		
		// singou[1]の中身の'黄'が呼び出される
		char x = singou[1] ;
		System.out.println("要素の参照：" + x );
		
		int count = singou.length ;
		System.out.println("要素数：" + count );
		
		
		// 配列の宣言と同時に複数の要素を初期化することも可能
		// 一度に代入する際は{}を使用する
		// 下記のどちらでも初期化が可能
		// char[] singou = new char[]{'赤','黄','青'};
		// char[] singou = {'赤','黄','青'};
		
		// 配列の要素数を取得する
		// 配列名.length
	}
}
