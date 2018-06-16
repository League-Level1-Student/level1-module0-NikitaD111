import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	new FortuneCookie().showButton();
}
public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button); 
button.addActionListener(this);
frame.pack();
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Button Clicked");
	JOptionPane.showMessageDialog(null, "WooHoo");
	int rand = new Random().nextInt(5);
	if(rand == 0){
		JOptionPane.showMessageDialog(null, "You are lucky");
	}
	else if(rand == 1){
		JOptionPane.showMessageDialog(null, "You will find great whealth");
	}
	else if(rand == 2){
		JOptionPane.showMessageDialog(null, "You will find treasure");
	}
	else if(rand == 3){
		JOptionPane.showMessageDialog(null, "You will turn into a cactus");
	}
	else if(rand == 4){
		JOptionPane.showMessageDialog(null, "You will be taken on a great adventure");
	}
}
}
