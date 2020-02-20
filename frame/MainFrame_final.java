package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class MainFrame_final extends JFrame implements ActionListener{

	public static void main(String[] args) {
		
		MainFrame_final window = new MainFrame_final();
		
	}

	public MainFrame_final() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		이미지
		mainPanel mainpanel = new mainPanel(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\main.png").getImage());
		setSize(new Dimension(mainpanel.getDim()));
		setPreferredSize(new Dimension(mainpanel.getDim()));
		getContentPane().add(mainpanel, BorderLayout.SOUTH);
		
		
//		문제풀기
		JButton prbS = new JButton("문제풀기");
		prbS.setForeground(new Color(15248986));
		prbS.setFont(new Font("굴림", Font.BOLD, 15));
		prbS.setBorder(null);
		prbS.setBackground(new Color(9803));
		prbS.setBounds(453, 431, 72, 44);
		mainpanel.add(prbS);
		
//		문제입력
		JButton prbE = new JButton("문제입력");
		prbE.setForeground(new Color(15248986));
		prbE.setFont(new Font("굴림", Font.BOLD, 15));
		prbE.setBorder(null);
		prbE.setBackground(new Color(9803));
		prbE.setBounds(540, 431, 72, 44);
		mainpanel.add(prbE);
		
//		문제수정
		JButton prbC = new JButton("문제수정");
		prbC.setForeground(new Color(15248986));
		prbC.setFont(new Font("굴림", Font.BOLD, 15));
		prbC.setBorder(null);
		prbC.setBackground(new Color(9803));
		prbC.setBounds(623, 431, 72, 44);
		mainpanel.add(prbC);
		
//		문제삭제
		JButton button = new JButton("문제삭제");
		button.setForeground(new Color(232, 174, 90));
		button.setFont(new Font("굴림", Font.BOLD, 15));
		button.setBorder(null);
		button.setBackground(new Color(0, 38, 75));
		button.setBounds(709, 431, 72, 44);
		mainpanel.add(button);
		
//		채팅창 버튼
		JButton chatBtn = new JButton("채팅창");
		chatBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chatBtn.setBorder(null);
		chatBtn.setBounds(457, 537, 146, 88);
		chatBtn.setBackground(new Color(15248986));
		chatBtn.setForeground(new Color(9803));
		chatBtn.setFont(new Font("굴림", Font.BOLD, 30));
		
		mainpanel.add(chatBtn);
		
//		로그인
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginBtn.setBorder(null);
		loginBtn.setBounds(458, 540, 146, 88);
		loginBtn.setBackground(new Color(15248986));
		loginBtn.setForeground(new Color(9803));
		loginBtn.setBounds(627, 537, 146, 88);
		loginBtn.setFont(new Font("굴림", Font.BOLD, 30));
		mainpanel.add(loginBtn);
		
//		회원가입
		JButton signUpBtn = new JButton("회원가입");
		signUpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signUpBtn.setBorder(null);
		signUpBtn.setBounds(795, 537, 146, 88);
		signUpBtn.setBackground(new Color(15248986));
		signUpBtn.setForeground(new Color(9803));
		signUpBtn.setFont(new Font("굴림", Font.BOLD, 30));
		mainpanel.add(signUpBtn);
		
//		새로고침 버튼
		JButton RefreshBtn = new JButton();
		RefreshBtn.setBounds(31, 24, 58, 51);
		RefreshBtn.setBorderPainted(false);
		RefreshBtn.setContentAreaFilled(false);
		RefreshBtn.setFocusPainted(false);
		mainpanel.add(RefreshBtn);
		
//		프로필 버튼 -> 마이페이지 들어감
		JButton profileBtn = new JButton();
		profileBtn.setBounds(907, 24, 58, 62);
		profileBtn.setBorderPainted(false);
		profileBtn.setContentAreaFilled(false);
		profileBtn.setFocusPainted(false);
		mainpanel.add(profileBtn);
		
//		접속자 라벨
		JLabel visitorLabel = new JLabel();
		visitorLabel.setBounds(876, 240, 118, 163);
		mainpanel.add(visitorLabel);
		
//		크기조정
		setSize(mainpanel.getDim());
		setPreferredSize(mainpanel.getDim()); 
		
//		버튼 클릭되는지 확인용
//		RefreshBtn.addActionListener(this);
//		profileBtn.addActionListener(this);
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼이 클릭됨");
	}
}