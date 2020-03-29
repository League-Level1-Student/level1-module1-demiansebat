package _06_duck;

import javax.swing.JOptionPane;

public class Dog {
String treats;
int age;
Dog(String treats,int age) {
  	this.treats = treats;
  	this.age = age;
}
void bark() {
	JOptionPane.showMessageDialog(null, "WOOF!!!");
}
void fetch() {
	JOptionPane.showMessageDialog(null, "The dog has fetched the ball");
}
void eat() {
	JOptionPane.showMessageDialog(null, "The dog has eaten his food");
}

}
