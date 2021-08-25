package r_p_s;

import javax.swing.JFrame;

public class GameMain {

	public static void main(String[] args) {
		//ウィンドウ設定
		//---ウィンドウ名
		JFrame frame = new JFrame("じゃんけんゲーム");
		//---ウィンドウサイズ
		frame.setSize(640, 480);
		//---ウィンドウの発生場所を画面の中心にする
		frame.setLocationRelativeTo(null);
		//---ウィンドウの✕をクリックして終了できるようにする
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//---ウィンドウのサイズを固定する
		frame.setResizable(false);

		//---パネル生成
		Panel.createPanel(frame);
		
		//---ウィンドウ表示
		frame.setVisible(true);
	}

	
	
}
