import java.util.List;
import java.util.Stack;

public class SumOfK {
    public static Stack<Integer> stack;
    public static List<Integer> list;
    public static int distance;
    public static Integer max;

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        stack = new Stack<>();
        list=ls;
        distance=t;
        max = 0;
        
        chooseBestSum(k, 0);
        
        if (max == 0)
            return null;
        return max;
    }
    
    public static void chooseBestSum(int k, int start) {
        if (k == 0) {
            int currDist = 0;
            currDist = stack.stream().map((index) -> list.get(index)).reduce(currDist, Integer::sum);
            if (currDist <= distance)
                max = Math.max(max, currDist);
        } else {
            for (int i = start; i < list.size(); i++) {
                stack.push(i);
                chooseBestSum(k - 1, i + 1);
                stack.pop();
            }
        }
    }
}