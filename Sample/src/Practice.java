
public class Practice {
	public static void main(String[] args) {
		int[] score = {20, 30, 40, 50, 80};
		int sum = 0;
		double ave = 0;
		int count = 0;
		for(int i = 0; i < score.length; i++) {
			sum = sum + score[i];
			if(score[i] < 35) {
				count++;
			}
		}
		ave = sum / score.length;
		System.out.println(sum);
		System.out.println(ave);
		System.out.println(count);
		
	}
}