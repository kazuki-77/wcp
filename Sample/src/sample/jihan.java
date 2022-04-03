package sample;

public class jihan {
	public static void main(String[] args) {
		int coinNum = args.length; // 投入された硬貨の枚数
		int coinSum = 0;  //投入された硬貨の合計金額（使用可能な硬貨のみで計算）
		int coinChk = 0; // チェック対象の硬貨の金額
		
		//投入された硬貨を一枚ずつチェックし、合計金額を取得し、使用できない場合は、エラーメッセージを出力
		for(int i = 0; i < coinNum; i++ ) {
			// 硬貨をセット
			coinChk = Integer.parseInt(args[i]);
			if(coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500 ) {
				coinSum += coinChk;
			} else if(coinChk == 1 || coinChk == 5) {
				System.out.println("警告:" + coinChk + "円玉は使えません");
			} else {
				System.out.println("警告:" + coinChk + "は使えません") ;
			}
		}
		//投入された硬貨の合計金額をメッセージとして出力
		System.out.println("ただいまの投入金額は" + coinSum + "円です");
	}
}
