import java.util.*;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        
        for(char c : c1) {
          if(!list.contains(c))
            list.add(c);
        }
          
        for(char d : c2) {
          if(!list.contains(d))
            list.add(d);
        }
        
        Collections.sort(list);
        return list.toString().replaceAll("[,\\s\\[\\]]", "");
    }
}