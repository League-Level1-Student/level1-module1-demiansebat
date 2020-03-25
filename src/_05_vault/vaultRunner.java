package _05_vault;

public class vaultRunner {
public static void main(String[] args) {
	vault code=new vault();
	JamesBond sneaky=new JamesBond();
	int find=sneaky.findCode(code);
	if(find==-1) {
		System.out.println("Epic Fail!");}
	else {
		System.out.println("Success! The code was "+find);
	}
}
}
