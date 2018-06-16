import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CutnessTV implements ActionListener {
	JButton button = new JButton();
public static void main(String[] args) {
	new CutnessTV().animals();
}
	public void animals(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(button);
		JPanel panel = new JPanel();
		button.addActionListener(this);
	
		
	}
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Button Clicked");
		
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
