package metzler_p1;
import java.util.Scanner; 

public class Application {
	public String encryptedValue, value;
	
	public static void main(String[] args) {
		String answer = "null";
		String value = "null";
		Scanner sc = new Scanner(System.in); 
		
		Encrypter testEncrypt = new Encrypter();
		Decrypter testDecrypt = new Decrypter();
				
		
		while(!(answer.equalsIgnoreCase("exit"))){
		
		System.out.println("Would you like to *decrypt* or *encrypt* a number? ");
		System.out.println("Type exit to end the program.");
		answer = sc.nextLine();
		
		if(answer.equalsIgnoreCase("decrypt")) {
			System.out.println("Enter your 4 digit number: ");
			value = sc.nextLine();
			String DecryptedValue = Decrypter.ValueDecrypter(value);
			
			System.out.print("Your decrypted value: ");
			System.out.println(DecryptedValue);
		}
		else if(answer.equalsIgnoreCase("encrypt")) {
			System.out.println("Enter your 4 digit number: ");
			value = sc.nextLine();
			String EncryptedValue = Encrypter.ValueEncrypter(value);
			
			System.out.print("Your encrypted value: ");
			System.out.println(EncryptedValue);
		}
		
		
		}
		
	}
}
