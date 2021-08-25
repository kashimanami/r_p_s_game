package r_p_s;

public class Judge {
	//勝ち数
	private static int winCount;
	
	//勝ち負け判断
	public static void judgeWinCount(int playerHand, int computerHand) {
		//プレイヤーの勝ち→勝ち数+1、あいこ→勝ち数そのまま、プレイヤーの負け→勝ち数0にリセット
		if (playerHand == 1 && computerHand == 2 || playerHand == 2 && computerHand == 3
				|| playerHand == 3 && computerHand == 1) {
			winCount = winCount + 1;
			Panel.headerLabel.setText("プレイヤーの勝ち！(" + winCount + ")");
		} else if (playerHand == computerHand) {
			Panel.headerLabel.setText("あいこ！(" + winCount + ")");
		} else {
			winCount = 0;
			Panel.headerLabel.setText("コンピュータの勝ち！(" + winCount + ")");
		}
	}
}
