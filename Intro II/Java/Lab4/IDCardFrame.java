import java.io.File;
import java.io.IOException;
import java.awt.*; 
import javax.swing.*;

public class IDCardFrame extends JFrame {
	
	private String title;
	private JLabel nameLabel;
	private JLabel addressLabel;
	private JLabel occupationLabel;
	private JLabel pictureLabel;
	private JLabel heightLabel;
	private JLabel weightLabel;
	private JLabel eyeLabel;
	private JFrame frame;
	private ImageIcon image;
	private GridBagConstraints layoutConst;


	/**
		Constructs the JFrame of an ID Card.
		@param word Title of JFrame
	 */
	IDCardFrame(String word){
		
		title = word;


		frame = new JFrame(title);



		// NAME
	    nameLabel = new JLabel();
	    nameLabel.setText("Master Shifu");

	    // HEIGHT
	    heightLabel = new JLabel();
	    heightLabel.setText("Height: 1'8\"");

	    // WEIGHT
	    weightLabel = new JLabel();
	    weightLabel.setText("Weight: 11 lbs");

	    // EYE COLOR
	    eyeLabel = new JLabel();
	    eyeLabel.setText("Eye Color: Brown");

	    // ADDRESS/LOCATION
	    addressLabel = new JLabel();
	    addressLabel.setText("China");

	    // OCCUPATION
	    occupationLabel = new JLabel();
	    occupationLabel.setText("Java Programmer");
	    occupationLabel.setForeground(Color.red); // Sets the text's color to red

	    // PICTURE
	    image = new ImageIcon("RedPanda.jpg");
	    pictureLabel = new JLabel();
	    pictureLabel.setIcon(image);



	    frame.setLayout(new GridBagLayout());



	    // NAME
	    layoutConst = new GridBagConstraints();
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 0;
	    layoutConst.insets = new Insets(0,0,5,0);
	    frame.add(nameLabel, layoutConst);

	    // HEIGHT
	    layoutConst = new GridBagConstraints();
	    layoutConst.gridx = 2;
	    layoutConst.gridy = 0;
	    frame.add(heightLabel, layoutConst);

	    // WEIGHT
	    layoutConst = new GridBagConstraints();
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 0;
	    frame.add(weightLabel, layoutConst);

	    // EYE COLOR
	    layoutConst = new GridBagConstraints();
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 1;
	    frame.add(eyeLabel, layoutConst);

	    // ADDRESS/LOCATION
	    layoutConst = new GridBagConstraints();
	    layoutConst.gridx = 2;
	    layoutConst.gridy = 1;
	    frame.add(addressLabel, layoutConst);

	    // PICTURE
	    layoutConst = new GridBagConstraints();
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 1;
	    frame.add(pictureLabel, layoutConst);

	    // OCCUPATION
	    layoutConst = new GridBagConstraints();
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 2;
	    layoutConst.insets = new Insets(5,0,0,0);
	    frame.add(occupationLabel, layoutConst);



	    frame.setBackground(Color.green); // Sets the frame color to green

	    // Sets the size of the frame (5:3 ratio)
	    frame.setSize(300,180);

		// Sets the program to exit when the user closes the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // Makes the frame visible to the user
	    frame.show();

	    // Makes the frame impossible to resize
	    frame.setResizable(false);
	}

	public static void main(String[] args){
		// Creates myFrame and its components
	    IDCardFrame cardFrame = new IDCardFrame("ID Card");
	}
}