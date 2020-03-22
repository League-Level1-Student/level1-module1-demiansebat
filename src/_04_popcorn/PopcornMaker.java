package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor= JOptionPane.showInputDialog("What flavor do you want your popcorn?");
	String time1= JOptionPane.showInputDialog("How long would you like the popcorn to be cooked for?");
	int time=Integer.parseInt(time1);
	Popcorn kearnal=new Popcorn(flavor);
	Microwave mikey= new Microwave();
	mikey.putInMicrowave(kearnal);
	mikey.setTime(time);
	mikey.startMicrowave();
	
}
}
