package r_p_s;

import java.util.Random;

public class Computer {
	public static int decidesComputerHand() {
		//ランダムに1～3を生成する
		Random random = new Random();
		int computerHand = random.nextInt(3)+1;
		//1ならグー、2ならチョキ、3ならパーをcontentsLabelに表示する
		if (computerHand == 1) {
			Panel.contentsLabel.setText("グー");
		}else if (computerHand == 2) {
			Panel.contentsLabel.setText("チョキ");
		}else if (computerHand == 3) {
			Panel.contentsLabel.setText("パー");
		}
		return (computerHand);
	}
}
