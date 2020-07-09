package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	@SuppressWarnings("deprecation")
	public void run() {
		
		frame.setVisible(true);
		frame.add(button);
		button.setLabel("surprise!");
		button.addActionListener(this);
		frame.pack(); 
	}
	String fileName = "jackInTheBox.png";
	private void showPicture(String fileName) { 
	    try {
	         JLabel imageLabel = createLabelImage(fileName);
	         JFrame frame = new JFrame();
	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         frame.add(imageLabel);
	         frame.setVisible(true);
	         frame.pack();
	    } catch (Exception e) {
	         e.printStackTrace();
	    }
	}
	
	private JLabel createLabelImage(String fileName) {
	    try {
	         java.net.URL imageURL = getClass().getResource(fileName);
	         if (imageURL == null) {
	              System.err.println("Could not find image " + fileName);
	              return new JLabel();
	         } else {
	              Icon icon = new ImageIcon(imageURL);
	              JLabel imageLabel = new JLabel(icon);
	              return imageLabel;
	         }
	    } catch (Exception e) {
	         System.err.println("Could not find image " + fileName);
	         return new JLabel();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int timesButtonPressed = 0;
		if (button.getModel().isPressed()) {
			
			timesButtonPressed = timesButtonPressed + 1;
		}
		if (timesButtonPressed == 5) {
			
			createLabelImage(fileName);
			playSound("homer-woohoo.wav");
		}
	}
	
	@SuppressWarnings("deprecation")
	private void playSound(String soundFile) { 
	     try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
