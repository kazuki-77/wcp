class Sample1_13_1 {
	public static void main (String[] args) {
		
		// break文のしくみ
		// break文は処理を中断し、繰り返しブロックを抜ける効果を持つ
		// [ break; ] と書けば実行される
		// if文などと組み合わせ、ある条件を満たしたら繰り返し処理を抜けたい場合に使用する
		String print1 = "" ;
		
		for(int i = 0 ; i < 10 ; i++){
			
			if(i == 7){ // もし７になったらループから抜ける
				break;
			}
			
			print1 += i + " " ;
			
		}
		
		System.out.println("print1：" + print1);
		
		
		
		//continue文のしくみ
		// 繰り返し処理を中断し、次の繰り返し処理に移る効果を持つ。
		// [ continue ]と書けば実行される
		// if文などと組み合わせ、ある条件を満たしたら繰り返し処理を抜けたい場合に使用する
		
		String print2 = "" ;
		
		for(int i = 0 ; i < 10 ; i++){
			
			if(i == 7){
				continue;
			}
			
			print2 += i + " " ;
			
		}
		
		System.out.println("print2：" + print2);
		
	}
}
