import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JButton button = new JButton(); 
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	new SoundEffects().sounds();
 }
	public void sounds() {
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
		button.setText("WooHoo");
		button1.setText("drum");
		button2.setText("cymbal");
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked");
		e.getSource();
		if(e.getSource() == button) {
			playSound("homer-woohoo.wav");
		}
		if(e.getSource() == button1) {
		playSound("drum.wav");
		}
		if(e.getSource() == button2) {
			playSound("cymbal.wav");
		}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}
