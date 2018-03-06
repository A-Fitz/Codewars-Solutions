import java.util.ArrayList;

public class DRoot {
  public static int digital_root(int n) {
    int result=0;
    String temp = String.valueOf(n);
    
    for(int i = 0; i < temp.length(); i++) {
      result += (temp.charAt(i)-'0');
    }
      
    if(String.valueOf(result).length() > 1) {
      String tempStr = String.valueOf(result);
      result = (tempStr.charAt(0)-'0') + (tempStr.charAt(1)-'0');
    }
      
    
    return result;
  }
}