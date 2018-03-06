public class BitCounting {

	public static int countBits(int n){
		String binaryString = Integer.toBinaryString(n);
    int counter = 0;
    
    for(int i = 0; i < binaryString.length(); i++) {
      if(binaryString.charAt(i) == '1')
        counter++;
    }
    return counter;
	}
	
}