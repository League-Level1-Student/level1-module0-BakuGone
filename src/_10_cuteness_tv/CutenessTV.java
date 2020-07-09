package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton duckButton = new JButton();
	JButton frogButton = new JButton();
	JButton unicornButton = new JButton();
	JPanel panel = new JPanel();
	
	void run() {
		
		panel.add(duckButton);
		panel.add(frogButton);
		panel.add(unicornButton);
		
		frame.setVisible(true);
		panel.setVisible(true);
		duckButton.setVisible(true);
		frogButton.setVisible(true);
		unicornButton.setVisible(true);

		
		duckButton.setLabel("ducks!");
		frogButton.setLabel("frogs!");
		unicornButton.setLabel("unicorns!");
		
		duckButton.addActionListener(this);
		unicornButton.addActionListener(this);
		frogButton.addActionListener(this);
		
		frame.pack();
	}
	void playVideo(String videoID) {
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
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
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(frogButton.getModel().isArmed()) {
			
			showFrog();
		}
		
		if(duckButton.getModel().isArmed()) {
			
			showDucks();
		}
		
		if(unicornButton.getModel().isArmed()) {
			
			showFluffyUnicorns();
		}
	}
}
