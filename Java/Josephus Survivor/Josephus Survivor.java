import java.util.*;

public class JosephusSurvivor {
  public static int josephusSurvivor(final int n, final int k) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 1; i <= n; i++) {
      list.add(i);
    }
    
    int num = 0;
    while(list.size() > 1) {
      num = (num + k - 1) % list.size();
      list.remove(num);
    }
    return list.get(0);
  }  
}