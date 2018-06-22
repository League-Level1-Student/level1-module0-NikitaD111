import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutnessTV implements ActionListener {
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	new CutnessTV().animals();
}
	public void animals(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Button Clicked");
	if (e.getSource()==button) {
		  playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}
	if (e.getSource()==button1) {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	if(e.getSource()==button2) {
		 playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	
}
}
