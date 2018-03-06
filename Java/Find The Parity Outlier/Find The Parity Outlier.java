public class FindOutlier{
  static int find(int[] integers){
  int even = 0, odd = 0;
  int evenNum = 0, oddNum = 0;
    for(int i = 0; i < integers.length; i++) {
      if(integers[i] % 2 == 0) {
        even = integers[i];
        evenNum++;
      } else {
        odd = integers[i];
        oddNum++;
      }
    }
    if(evenNum > oddNum)
      return odd;
    else
      return even;
  }
}