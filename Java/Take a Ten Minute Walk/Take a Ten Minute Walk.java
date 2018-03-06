public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    int lat = 0;
    int lon = 0;
    int steps = 0;
    
    for(int i = 0; i < walk.length; i++) {
      steps++;
      switch(walk[i]) {
        case 'n':
          lon++;
          break;
        case 's':
          lon--;
          break;
        case 'w':
          lat++;
          break;
        case 'e':
          lat--;
          break;
      }
    }
    
    if(lat == 0 && lon == 0 && steps == 10)
      return true;
      
    return false;
  }
}