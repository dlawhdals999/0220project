package board;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import chatting.MultiChatClient;
import login.LoginMain;
import login.MemberInfoVO;
import login.SignUpMain;
import quiz.EnteringMain;
import quiz.QuizDAO;
import quiz.QuizMain;
import quiz.QuizVO;

public class BoardMain extends JFrame implements ActionListener{
	
	static MemberInfoVO mvo = new MemberInfoVO();
	
	
	static JButton solveButton = new JButton("문제풀기");
	static JButton inputButton = new JButton("문제입력");
	static JButton updateButton = new JButton("문제수정");
	static JButton deleteButton = new JButton("문제삭제");
	static JButton chatButton = new JButton("채팅창");
	static JButton loginButton = new JButton("로그인");
	static JButton joinButton = new JButton("회원가입");
	
	ArrayList<QuizVO> quizvo = new ArrayList<QuizVO>();
	
	public BoardMain() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainPanel MainPanel = new MainPanel(new ImageIcon(".\\src\\images\\main.png").getImage());
		getContentPane().add(MainPanel);
		setLayout(null);
		setResizable(false);
		
		String[] columnNames = { "번호", "문제", "작성일" };
		DefaultTableModel model = new DefaultTableModel(columnNames,0);
		JTable table = new JTable(model);
		JScrollPane sc = new JScrollPane(table);
		sc.setBounds(150,132,684,283);
		MainPanel.add(sc);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		
//		quizvo 객체배열로 가져오기
		quizvo = QuizDAO.setquiz();

//		quizvo 테이블에 올리기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) H:mm:ss");
		String[] rowData = new String[3];
		for (QuizVO data : quizvo) {
				rowData[0] = data.getIdx() + "";
				rowData[1] = data.getQuiz();
				rowData[2] = sdf.format(data.getWriteDate());
				model.addRow(rowData);
			}
		
		
		
//		 테이블에 마우스클릭하면 인덱스 가져오기
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
//				getSelectedRow() : JTable에서 몇 번째 행이 선택되었나 얻어온다.
//				System.out.println("선택된 행 : " + table.getSelectedRow());
				int position = table.getSelectedRow();
				
//				테이블에 저장된 전체 글 목록에서 JTable에서 선택한 행에 해당되는 글 1건을 얻어오는 select sql 명령을 실행하는 MemoProjectDAO
//				클래스의 메소드를 호출하고 리턴되는 결과를 MemoVO 클래스 객체로 받는다.
				MemoVO vo = MemoProjectDAO.selectByIdx(position);
				
				
				
				int row = table.getSelectedRow();
//				getSelectedColumn() : JTable에서 몇 번째 열이 선택되었나 얻어온다.
//				int col = table.getSelectedColumn();
//				getValueAt(row, col) : JTable에서 row행 col열에 위치한 데이터를 얻어온다.
				Object object = table.getValueAt(row, 0);
				int position = Integer.parseInt((String) object);
				MemoVO vo = MemoProjectDAO.selectByIdx(position);
				System.out.println(vo);
				
				
//				리턴받은 MemoVO 클래스 객체에 저장된 데이터를 텍스트 필드에 넣어주고 포커스를 패스워드 필드로 옮겨준다.
				nameField.setText(vo.getName());
				passwordField.setText("");
				memoField.setText(vo.getMemo());
				passwordField.requestFocus();
				nameField.setEditable(false);
				*/
				
			}
			
			
		});
		
		chatButton.setBorder(null);
		chatButton.setBounds(457, 537, 146, 88);
		chatButton.setBackground(new Color(15248986));
		chatButton.setForeground(new Color(9803));
		chatButton.setFont(new Font("굴림", Font.BOLD, 30));
		MainPanel.add(chatButton);
		chatButton.addActionListener(this);
		
		solveButton.setForeground(new Color(15248986));
		solveButton.setFont(new Font("굴림", Font.BOLD, 15));
		solveButton.setBorder(null);
		solveButton.setBackground(new Color(9803));
		solveButton.setBounds(499, 436, 72, 44);
		MainPanel.add(solveButton);
		solveButton.addActionListener(this);
		
		inputButton.setForeground(new Color(15248986));
		inputButton.setFont(new Font("굴림", Font.BOLD, 15));
		inputButton.setBorder(null);
		inputButton.setBackground(new Color(9803));
		inputButton.setBounds(583, 436, 72, 44);
		MainPanel.add(inputButton);
		inputButton.addActionListener(this);
		
		updateButton.setForeground(new Color(15248986));
		updateButton.setFont(new Font("굴림", Font.BOLD, 15));
		updateButton.setBorder(null);
		updateButton.setBackground(new Color(9803));
		updateButton.setBounds(667, 436, 72, 44);
		MainPanel.add(updateButton);
		updateButton.addActionListener(this);
		
		deleteButton.setForeground(new Color(232, 174, 90));
		deleteButton.setFont(new Font("굴림", Font.BOLD, 15));
		deleteButton.setBorder(null);
		deleteButton.setBackground(new Color(0, 38, 75));
		deleteButton.setBounds(752, 436, 72, 44);
		MainPanel.add(deleteButton);
		deleteButton.addActionListener(this);
		
		loginButton.setBorder(null);
		loginButton.setBounds(458, 540, 146, 88);
		loginButton.setBackground(new Color(15248986));
		loginButton.setForeground(new Color(9803));
		loginButton.setBounds(627, 537, 146, 88);
		loginButton.setFont(new Font("굴림", Font.BOLD, 30));
		MainPanel.add(loginButton);
		loginButton.addActionListener(this);
		
		joinButton.setBorder(null);
		joinButton.setBounds(795, 537, 146, 88);
		joinButton.setBackground(new Color(15248986));
		joinButton.setForeground(new Color(9803));
		joinButton.setFont(new Font("굴림", Font.BOLD, 30));
		MainPanel.add(joinButton);
		joinButton.addActionListener(this);
		
		chatButton.setEnabled(false);
		inputButton.setEnabled(false);
		updateButton.setEnabled(false);
		deleteButton.setEnabled(false);
		
		setSize(MainPanel.getDim());
		setPreferredSize(MainPanel.getDim()); 
		setVisible(true);
		
		pack();

	}
		
	public static void main(String[] args) {
		
		BoardMain window = new BoardMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		
		
		
		switch (e.getActionCommand()) {
		case "문제풀기":
			QuizMain quizmain = new QuizMain();
			quizmain.setVisible(true);
			break;
		case "문제입력":
			EnteringMain entering = new EnteringMain();
			break;
		case "문제수정":
			JOptionPane.showMessageDialog(null, "수정(아직안함)");
			break;
		case "문제삭제":
			JOptionPane.showMessageDialog(null, "삭제(아직안함)");
			break;
		case "채팅창":
			MultiChatClient chat = new MultiChatClient();
			Thread thread = new Thread(chat);
			thread.start();
//			ChattingFrame chat = new ChattingFrame();
			JOptionPane.showMessageDialog(null, "채팅창");
			break;
			
		case "로그인":
			LoginMain loginMain = new LoginMain();
			loginMain.setVisible(true);
			if(mvo.getUserID() != null) {
//				로그인이 됬을때 버튼 바꾸기
				getJoinButton().setEnabled(false);
				getLoginButton().setEnabled(false);
			}
			break;
			
		case "회원가입":
			SignUpMain signUpMain = new SignUpMain();
			signUpMain.setVisible(true);
			break;
			
		case "로그아웃":
			int logout = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
			if(logout == 0) {
//				로그아웃되면 버튼 비활성화
				getInputButton().setEnabled(false);
				getUpdateButton().setEnabled(false);
				getDeleteButton().setEnabled(false);
				getChatButton().setEnabled(false);
				getJoinButton().setEnabled(true);
				getLoginButton().setText("로그인");	
				JOptionPane.showMessageDialog(null, "로그아웃 되었습니다.");
//				mvo 비워주기
				mvo = new MemberInfoVO();
			}
			break;
		}
	}

	public static MemberInfoVO getMvo() {
		return mvo;
	}

	public static void setMvo(MemberInfoVO mvo) {
		BoardMain.mvo = mvo;
	}

	public static JButton getSolveButton() {
		return solveButton;
	}

	public static void setSolveButton(JButton solveButton) {
		BoardMain.solveButton = solveButton;
	}

	public static JButton getInputButton() {
		return inputButton;
	}

	public static void setInputButton(JButton inputButton) {
		BoardMain.inputButton = inputButton;
	}

	public static JButton getUpdateButton() {
		return updateButton;
	}

	public static void setUpdateButton(JButton updateButton) {
		BoardMain.updateButton = updateButton;
	}

	public static JButton getDeleteButton() {
		return deleteButton;
	}

	public static void setDeleteButton(JButton deleteButton) {
		BoardMain.deleteButton = deleteButton;
	}

	public static JButton getChatButton() {
		return chatButton;
	}

	public static void setChatButton(JButton chatButton) {
		BoardMain.chatButton = chatButton;
	}

	public static JButton getLoginButton() {
		return loginButton;
	}

	public static void setLoginButton(JButton loginButton) {
		BoardMain.loginButton = loginButton;
	}

	public static JButton getJoinButton() {
		return joinButton;
	}

	public static void setJoinButton(JButton joinButton) {
		BoardMain.joinButton = joinButton;
	}



}
