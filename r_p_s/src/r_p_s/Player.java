package r_p_s;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Player implements ActionListener {
	//ボタン生成
	public static void createButton(JPanel footerPanel) {
		//グー
		//グーと書いてあるボタンを生成
		JButton btnGu = new JButton("グー");
		//ボタン設定
		btnGu = setButton(btnGu);
		//フッターパネルの西（左）に追加
		footerPanel.add(btnGu, BorderLayout.WEST);
		
		JButton btnChoki = new JButton("チョキ");
		btnChoki = setButton(btnChoki);
		footerPanel.add(btnChoki, BorderLayout.CENTER);
		
		JButton btnPa = new JButton("パー");
		btnPa = setButton(btnPa);
		footerPanel.add(btnPa, BorderLayout.EAST);
	}
	
	//ボタン設定
	public static JButton setButton(JButton button) {
		//ボタンサイズを指定
		int buttonSizeX = (640 - 20)/3;
		Dimension buttonDimesion = new Dimension(buttonSizeX, 50);
		button.setPreferredSize(buttonDimesion);
		//フォントを指定
		Font buttonFont = new Font("ＭＳ ゴシック",Font.PLAIN,24);
		button.setFont(buttonFont);
		
		//プレイヤーがボタンを押したときの動作指定
		Player player = new Player();
		button.addActionListener(player);
		
		return(button);
	}
	
	//プレイヤーがボタンを押したときの設定
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		int playerHand = 0;
		//playerHandはグーが押されたとき1、チョキが押されたとき2、パーが押されたとき3とする
		if (command.equals("グー")) {
			playerHand = 1;
		}else if (command.equals("チョキ")) {
			playerHand = 2;
		}else if (command.equals("パー")) {
			playerHand = 3;
		}
		
		//computerHandを生成
		int computerHand = Computer.decidesComputerHand();
		//勝ち負け判断
		Judge.judgeWinCount(playerHand, computerHand);
	}
}