package server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ServerFrame extends JFrame implements ActionListener{
	
	JButton startBtn;
	JButton chatBtn;
	JLabel screenLabel=null;
	JPanel panel;

	public static void main(String[] args) {
		ServerFrame window = new ServerFrame();
	}
	
	public ServerFrame() {
		setTitle("1:1 채팅 프로그램(서버)");
		MainPanel mainpanel = new MainPanel(new ImageIcon(".\\src\\images\\server.png").getImage());
		getContentPane().add(mainpanel, BorderLayout.SOUTH);
		
		//서버 시작,종료 버튼
		startBtn = new JButton("서버시작");
		startBtn.addActionListener(this);
		startBtn.setBounds(24, 429, 590, 46);
		startBtn.setBackground(new Color(15844367));
		startBtn.setFont(new Font("D2Coding", Font.PLAIN, 20));
		startBtn.setForeground(new Color(1586501));
		startBtn.setBorder(null);
		mainpanel.add(startBtn);
		
		//라벨
		screenLabel = new JLabel("");
		screenLabel.setHorizontalAlignment(JLabel.CENTER);
		screenLabel.setBounds(36, 37, 565, 356);
		mainpanel.add(screenLabel);
		screenLabel.setFont(new Font("D2Coding", Font.PLAIN, 20));
		screenLabel.setForeground(Color.white);
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(132, 431));
		setPreferredSize(mainpanel.getDim()); 
		pack();
		setVisible(true);
		
	}
	public JButton getStartBtn() {
		return startBtn;
	}

	public void setStartBtn(JButton startBtn) {
		this.startBtn = startBtn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ServerThread thread2 = new ServerThread();
		if(e.getActionCommand().equals("서버시작")) {
			getStartBtn().setText("서버종료");
			screenLabel.setText("서버가 실행되고 있습니다.");
			thread2.start();
		}//end if
		
		if(e.getActionCommand().equals("서버종료")) {
			getStartBtn().setText("서버시작");
			thread2.stop();
			try {
				ServerThread.serverSocket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			screenLabel.setText("서버를 시작해주세요.");
		}//end if

	}

}