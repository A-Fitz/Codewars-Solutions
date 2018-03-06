public class Kata
{
    public static String expandedForm(int num) {
        String result = "";

        for (int i = 10; i < num; i *= 10) {
            int part = num % i;
            num -= part;
            
            if(part != 0) {
              result = " + " + part + result;
            }
        }
        
        result = num + result;
        
        return result;
    }
}