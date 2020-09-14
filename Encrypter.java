package metzler_p1; 

public class Encrypter {	
	public static String ValueEncrypter(String Value) {
		
		//Value = "1234";
		//I don't know how y'all are testing this code with your strings, but feel free to use either application as it prompts you
		// Or just feel free to replace the "value" variable above
		
		int j, k;
		int[] remainder = {0, 0, 0, 0};
		int finalValue = 0;
		String finalValueString;
		
		int i = Integer.parseInt(Value);
		
		for(j=3; j>=0; j--) {
			remainder[j] = i % 10;
			i = i / 10;
		}
		
		for(k=3; k>=0; k--) {
			remainder[k] = remainder[k] + 7;
			remainder[k] = remainder[k] % 10;
			
			if(k==0)
				remainder[k] = remainder[k] * 10;
			else if(k==2)
				remainder[k] = remainder[k] * 1000;
			else if(k==3)
				remainder[k] = remainder[k] * 100;
			
					
			finalValue = finalValue + remainder[k];
		}
		
		finalValueString = Integer.toString(finalValue); 
		
		finalValueString = String.format("%04d", finalValue);
				
		return finalValueString;
	} 
}
