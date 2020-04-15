package _07_binary_converter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binaryconverter implements MouseListener {
	JLabel label=new JLabel();
	JTextField answer = new JTextField(20);
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
public void showButton() {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JPanel panel=new JPanel();
	JButton button=new JButton();
	button.addMouseListener(this);
	frame.add(panel);
	panel.add(label);
	panel.add(answer);
	panel.add(button);
	frame.setName("Convert 8 bits of binary to ASCII");
	frame.pack();
}
@Override
public void mouseClicked(MouseEvent arg0) {
	System.out.println("CLICK");
	String letter=convert(answer.getText());
	label.setText(letter);
}
@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}