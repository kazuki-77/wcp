class Sample1_10_1 {
	public static void main (String[] args) {
		
		//for文のしくみ
		// 繰り返し構文の一つ繰り返しは「条件を満たす限り同じ構造は
		//「繰り返し条件」「繰り返し処理」の二つに大きく分けられる
		// for文の構造
		// for(繰り返し条件)　{繰り返し処理}
		
		int loopCount = 0 ; //何回目のループかを表す数値（初期値0）
		
		System.out.println("▼[開始]for文");
		// iのことをカウンタ変数と呼ぶ
		// i < 4 は iが4以下であれば繰り返し処理を行う
		// i++  は iを＋１する
		for( int i = 0 ; i < 4 ; i++ ){
			System.out.println("  ▼[開始]1回分の繰り返し処理");
			
			//loopCountを1上げる
			loopCount += 1 ;  
			
			//loopCountおよびカウンタ変数iの表示
			System.out.println("    loopCount：" + loopCount);
			System.out.println("    i（カウンタ変数）：" + i);
			
			System.out.println("  ▲[終了]1回分の繰り返し処理");
		}
		
		System.out.println("▲[終了]for文");
		
	}
}
