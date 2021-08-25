package r_p_s;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
	public static JLabel headerLabel;
	public static JLabel contentsLabel;
	//パネル生成
	public static void createPanel(JFrame frame) {
		//ヘッダーパネル
		//---パネルサイズ
		Dimension headerPanelDimension = new Dimension(640, 50);
		//---パネル設定
		JPanel headerPanel = setPanel(new Color(9, 64, 103), headerPanelDimension);
		//---ラベルの文字
		headerLabel = new JLabel("「さあ、じゃんけんで勝負だ！」");
		//---ラベルの文字色・フォント・大きさ設定
		headerLabel = setFont(Color.WHITE,headerLabel,24);
		//---パネルにラベルを追加
		headerPanel.add(headerLabel);
		//---ウィンドウにパネルを位置指定で追加
		frame.add(headerPanel,BorderLayout.NORTH);
		
		//コンテンツパネル
		Dimension contentsPanelDimension = new Dimension(640, 380);
		JPanel contentsPanel = setPanel(Color.WHITE,contentsPanelDimension);
		contentsLabel = new JLabel("じゃんけん・・・");
		contentsLabel = setFont(Color.BLACK,contentsLabel,54);
		contentsPanel.add(contentsLabel);
		frame.add(contentsPanel,BorderLayout.CENTER);
		
		//フッタパネル
		Dimension footerPanelDimension = new Dimension(640, 50);
		JPanel footerPanel = setPanel(new Color(9, 64, 103),footerPanelDimension);
		//---パネルにボタン生成
		Player.createButton(footerPanel);
		frame.add(footerPanel,BorderLayout.SOUTH);
	}
	
	//パネル設定
	public static JPanel setPanel(Color color, Dimension PanelDimension) {
		JPanel panel = new JPanel();
		//---パネルのサイズ指定
		panel.setPreferredSize(PanelDimension);
		//---パネルのレイアウト指定を東西南北で指定する
		panel.setLayout(new BorderLayout());
		//---パネルの背景色指定
		panel.setBackground(color);
		return(panel);
	}
	
	//ラベル設定
	public static JLabel setFont(Color clr,JLabel label,int strSize) {
		//---文字色指定
		label.setForeground(clr);
		//---フォント・書体・文字サイズ指定
		Font labelFont = new Font("ＭＳ ゴシック",Font.PLAIN,strSize);
		label.setFont(labelFont);
		//---文字を水平中央に指定
		label.setHorizontalAlignment(JLabel.CENTER);
		//---文字を垂直中央に指定
		label.setVerticalAlignment(JLabel.CENTER);
		return(label);
	}
}
