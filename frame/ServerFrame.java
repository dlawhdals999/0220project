package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ServerFrame extends JFrame{


	public static void main(String[] args) {
		
		ServerFrame window = new ServerFrame();
		
	}
	
	public ServerFrame() {
		
		mainPanel mainpanel = new mainPanel(new ImageIcon("C:\\project_CYJ\\teamproject\\workspace\\Frame\\src\\images\\server.png").getImage());
		getContentPane().add(mainpanel, BorderLayout.SOUTH);
		
		JButton startBtn = new JButton("서버시작");
		startBtn.setBounds(24, 429, 590, 46);
		startBtn.setBackground(new Color(15844367));
		startBtn.setFont(new Font("D2Coding", Font.PLAIN, 20));
		startBtn.setForeground(new Color(1586501));
		startBtn.setBorder(null);
		mainpanel.add(startBtn);
		
		JLabel screenLabel = new JLabel("");
		screenLabel.setBounds(36, 37, 565, 356);
		mainpanel.add(screenLabel);
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(132, 431));
		setPreferredSize(mainpanel.getDim()); 
		pack();
		setVisible(true);
		
	}
}
