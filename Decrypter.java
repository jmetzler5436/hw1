package metzler_p1;

public class Decrypter {
	public static String ValueDecrypter(String encryptedValue) {
		
		//encryptedValue = "0189";
		//As the same with the encrypter file, feel free to use above or just use the application.
		
		int j, k;
		int[] remainder = {0, 0, 0, 0};
		int finalValue = 0;
		String decryptedValue;
		
		int i = Integer.parseInt(encryptedValue);
		
		for(j=3; j>=0; j--) {
			remainder[j] = i % 10;
			i = i / 10;
		}
		
		for(k=3; k>=0; k--) {
			remainder[k] = remainder[k] + 10;
			remainder[k] = remainder[k] - 7;
			if(remainder[k] > 10)
				remainder[k] = remainder[k] % 10;
			
			System.out.println(remainder[k]);
			
			if(k==0)
				remainder[k] = remainder[k] * 10;
			else if(k==2)
				remainder[k] = remainder[k] * 1000;
			else if(k==3)
				remainder[k] = remainder[k] * 100;
			
					
			finalValue = finalValue + remainder[k];
		}
		
		decryptedValue = Integer.toString(finalValue); 
		
		decryptedValue = String.format("%04d", finalValue);
		
		return decryptedValue;
	}
}
