package _05_vault;

import java.util.Random;

public class vault {
int secretCode=100;
vault(){
	Random randy=new Random();
	secretCode=randy.nextInt(1000000);
	secretCode=1000001;
}
boolean tryCode(int guess) {
	if(guess==secretCode) {
		return true;
	}
	return false;
}
}
