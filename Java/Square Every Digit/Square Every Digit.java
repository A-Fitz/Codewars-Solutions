import java.util.ArrayList;
import static java.lang.Math.pow;

/*
  This is slightly convoluted, but I wanted to do this without ever using a String.
  First it places each digit provided into an array, squares those values and places them into an ArrayList,
    then uses some math to get each digit from that arrayList and concentrate them into a single integer.
*/

public class SquareDigit {

  public int squareDigits(int n) {
    ArrayList<Integer> newList = new ArrayList<Integer>();
    int result = 0;
    int multiplier = 1;
    int temp = n;
    
    
    int[] list = new int[(int)(Math.log10(n)+1)];
    for(int i = 0; i < list.length; i++) {
      list[i] = (temp % 10);
      temp /= 10;
    }
    
    for(int j = 0; j < list.length; j++) {
      newList.add(list[j]*list[j]);
    }
    
    for (int k = 0; k < newList.size(); k++) {
      result += newList.get(k)*multiplier;
      multiplier *= Math.pow(10, String.valueOf(newList.get(k)).length());
    }
    
    return result;
  }

}