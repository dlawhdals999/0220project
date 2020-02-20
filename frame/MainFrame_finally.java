package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame_finally extends JFrame implements ActionListener{

	public static void main(String[] args) {
		
		MainFrame_finally window = new MainFrame_finally();
			
	}

	public MainFrame_finally() {
		
//		이미지와 크기조정
		mainPanel mainpanel = new mainPanel(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\main9.png").getImage());
		setSize(new Dimension(mainpanel.getDim()));
		setPreferredSize(new Dimension(mainpanel.getDim()));
		getContentPane().add(mainpanel, BorderLayout.SOUTH);
		
//		문제풀기
		JButton prbS = new JButton("문제풀기");
		prbS.setForeground(new Color(15248986));
		prbS.setFont(new Font("굴림", Font.BOLD, 15));
		prbS.setBorder(null);
		prbS.setBackground(new Color(9803));
		prbS.setBounds(500, 438, 72, 44);
		mainpanel.add(prbS);
		
//		문제입력
		JButton prbE = new JButton("문제입력");
		prbE.setForeground(new Color(15248986));
		prbE.setFont(new Font("굴림", Font.BOLD, 15));
		prbE.setBorder(null);
		prbE.setBackground(new Color(9803));
		prbE.setBounds(588, 438, 72, 44);
		mainpanel.add(prbE);
		
//		문제수정
		JButton prbC = new JButton("문제수정");
		prbC.setForeground(new Color(15248986));
		prbC.setFont(new Font("굴림", Font.BOLD, 15));
		prbC.setBorder(null);
		prbC.setBackground(new Color(9803));
		prbC.setBounds(672, 438, 72, 44);
		mainpanel.add(prbC);
		
//		문제삭제
		JButton button = new JButton("문제삭제");
		button.setForeground(new Color(232, 174, 90));
		button.setFont(new Font("굴림", Font.BOLD, 15));
		button.setBorder(null);
		button.setBackground(new Color(0, 38, 75));
		button.setBounds(756, 438, 72, 44);
		mainpanel.add(button);
		
//		채팅창 버튼
		JButton chatBtn = new JButton("채팅창");
		chatBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chatBtn.setBorder(null);
		chatBtn.setBounds(463, 537, 146, 88);
		chatBtn.setBackground(new Color(15248986));
		chatBtn.setForeground(new Color(9803));
		chatBtn.setFont(new Font("굴림", Font.BOLD, 30));
		
		mainpanel.add(chatBtn);
		
//		로그인버튼
		JButton loginBtn = new JButton("로그인");
		loginBtn.setForeground(new Color(0, 38, 75));
		loginBtn.setFont(new Font("굴림", Font.BOLD, 30));
		loginBtn.setBorder(null);
		loginBtn.setBackground(new Color(232, 174, 90));
		loginBtn.setBounds(629, 537, 146, 88);
		mainpanel.add(loginBtn);
		
		
//		회원가입
		JButton signUpBtn = new JButton("회원가입");
		signUpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signUpBtn.setBorder(null);
		signUpBtn.setBounds(798, 537, 146, 88);
		signUpBtn.setBackground(new Color(15248986));
		signUpBtn.setForeground(new Color(9803));
		signUpBtn.setFont(new Font("굴림", Font.BOLD, 30));
		mainpanel.add(signUpBtn);
		
//		새로고침 버튼
		JButton refreshBtn = new JButton();
		refreshBtn.setBounds(798, 50, 47, 38);
		refreshBtn.setBorderPainted(false);
		refreshBtn.setContentAreaFilled(false);
		refreshBtn.setFocusPainted(false);
		mainpanel.add(refreshBtn);

//		프로필 버튼
		JButton profileBtn = new JButton();
		profileBtn.setBounds(878, 38, 64, 61);
		profileBtn.setBorderPainted(false);
		profileBtn.setContentAreaFilled(false);
		profileBtn.setFocusPainted(false);
		mainpanel.add(profileBtn);
		
//		버튼 클릭 되는지 확인용
//		refreshBtn.addActionListener(this);
//		profileBtn.addActionListener(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼이 클릭됨");
	}

}
