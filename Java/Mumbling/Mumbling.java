public class Accumul {
    
    public static String accum(String s) {
     String result = "";
     
     for (int i = 0; i < s.length(); i++) {
       char c = s.charAt(i);
       
       for (int j = 0; j <= i; j++) {
         if (j == 0)
           result += Character.toUpperCase(c);
         else
           result += Character.toLowerCase(c);
       }
       
       result += "-";
     }
     
     return result.substring(0, result.length()-1);
    }
    
}