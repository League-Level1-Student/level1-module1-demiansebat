package _06_duck;

import javax.swing.JOptionPane;

public class duck {
	String favoriteFood;
	int numberOfFriends;
	void quack() {
		JOptionPane.showMessageDialog(null, "QUACK!!!");
	}
	duck(String favoriteFood, int numberOfFriends) {
	  	this.favoriteFood = favoriteFood;
	  	this.numberOfFriends = numberOfFriends;
	}
}
