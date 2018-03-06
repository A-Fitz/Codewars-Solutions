public class Maskify {
    public static String maskify(String str) {
        char[] charArray = str.toCharArray();
        
        if(charArray.length > 4) {
          for(int i = 0; i < charArray.length - 4; i++) {
            charArray[i] = '#';
          }
          return String.valueOf(charArray);
        }
        return str;
    }
}