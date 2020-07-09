package _09_sound_effects_machine;

import java.applet.AudioClip;
import javax.swing.JApplet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {
	
	JButton soundOne = new JButton();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
}
