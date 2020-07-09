package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class FortuneCookie implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
    public void run() {
    	
        frame.setVisible(true);
        frame.add(button);
        button.setSize(400, 200);
        button.addActionListener(this);
        frame.pack();
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		   int rand = new Random().nextInt(5);
		   if (rand == 0) {
			   
			   JOptionPane.showMessageDialog(null, "You will become brave and strong");
		   }
		   
		   else if (rand == 1) {
			   
			   JOptionPane.showMessageDialog(null, "There will be great things for you as long as you are patient");
		   }
		   
		   else if (rand == 2) {
			   
			   JOptionPane.showMessageDialog(null, "You will eventually find true love");
		   }
		   
		   else if (rand == 3) {
			   
			   JOptionPane.showMessageDialog(null, "Peace and eternal happieness will come your way");
		   }
		   
		   else if (rand == 4) {
			   
			   JOptionPane.showMessageDialog(null, "Things will eventually get better, don't worry");
		   }

		
	}

		
	}



