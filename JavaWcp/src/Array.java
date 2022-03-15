
public class Array {
	public static void main(String[] args) {
		// 配列の作成手順1
		int[] scores;
		scores = new int[5];
		
		// 作成手順2
		int[] scores2 = new int[5];
		int num = scores.length;
		System.out.println("要素の数:" + num);
		
		//　配列の要素に値を代入
		int[] scores3;
		scores3 = new int[5];
		scores3[1] = 30;
		System.out.println(scores3[1]);
		
		
		//　配列は自動的に初期化される
		int[] scores4 = new int[5];
		System.out.println(scores4[0]); //0が出力される　エラーにならない
		
		// 配列の省略方法
		// ①　要素の型[] 配列変数名 = new 要素の型[] { 値1, 値2, 値3・・・};
		// ②　要素の型[] 配列変数名 = { 値1, 値2, 値3・・・};
		int[] scores5 = new int[] { 20, 30, 40, 50, 80};
		int[] scores6 = { 20, 30, 40, 50, 80};
		
		// for文を使って配列を回す
		/* for (int i = 0; i < 配列変数名.length; i++) {
				配列変数名[i]を使った処理; 
			} */
		for (int i = 0; i < scores6.length; i++) {
			System.out.println(scores6[i]); // ループの度にiの値が 0 ~ 4 で変化する
		}
		
		// 点数管理プログラム(for分の利用)
		int[] score = {20, 30, 40, 50, 80};
		int sum = 0; // 集計結果を入れるための変数を初期化して準備
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 1科目ずつ変数sumに合算する
		}
		int avg = sum / score.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
		
		// 50点以上の科目の数を調べる
		int[] scores8 = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores8.length; i++) {
			if (scores8[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は:" + count);
		
		
		// DNAの記号をランダムに表示する
		int[] seq = new int[10];
		
		// 塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		//　生成した塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
			char[] base = {'A', 'T', 'G', 'C'};
			System.out.print(base[seq[i]] + " ");
		}
		
		// 拡張for文で配列を回す
		// for (要素の型　任意の変数名 : 配列変数名) {　・・・ }
		int[] scores9 =  {20, 30, 40, 50, 80};
		for (int value : scores9) {
			System.out.println(value);
		}
		
		
		// 2次元配列の利用
		int [][] scores10 = new int[2] [3]; //　2行3列の配列
		scores10[0][0] = 40;
		scores10[0][1] = 50;
		scores10[0][2] = 60;
		scores10[1][0] = 80;
		scores10[1][1] = 60;
		scores10[1][2] = 70;
		System.out.println(scores10[1][1]);
	}
}
