package frame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class scorePanel extends JPanel {

	private static Image img;
	public scorePanel (Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent (Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
	public static Dimension getDim() {
		return new Dimension(img.getWidth(null) , img.getHeight(null) + 130);
	}
	
}
