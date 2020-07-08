package _05_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the default java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the default package, and change the names below.

	String firstImage = "src/_05_body_part_quiz/taylor.jpg";
	String secondImage = "src/_05_body_part_quiz/billie.jpeg";
	String thirdImage = "src/_05_body_part_quiz/ellie.jpg";
	String fourthImage = "src/_05_body_part_quiz/robin.jpg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(200, 200);

		showNextImage();

	}

	private void startQuiz() {

		int score = 0;
		initializeGui();
		String guessTaylor = JOptionPane.showInputDialog("Who is this person?");

		if (guessTaylor.equalsIgnoreCase("taylor swift")) {
			
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is " + score);
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "That is incorrect. The person was Taylor Swift. Your score is " + score);

		}

		showNextImage();

		String guessBillie = JOptionPane.showInputDialog("Who is this person?");

		if (guessBillie.equalsIgnoreCase("billie eilish")) {
			
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is " + score);
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "That is incorrect. The person was Billie Eilish. Your score is " + score);

		}

		showNextImage();
		
		String guessEllie = JOptionPane.showInputDialog("Who is this person?");

		if (guessEllie.equalsIgnoreCase("Ellie Goulding")) {
			
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is " + score);
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "That is incorrect. The person was Ellie Goulding. Your score is " + score);

		}
		
		showNextImage();
		
		String guessRobin = JOptionPane.showInputDialog("Who is this person?");

		if (guessRobin.equalsIgnoreCase("Cavetown")) {
			
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is " + score);
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "That is incorrect. The person was Cavetown. Your score is " + score);

		}
		
		JOptionPane.showMessageDialog(null, "You got " + score + "/4. Nice job!");
		System.exit(0);
	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
