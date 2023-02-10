import java.util.Arrays;
import java.util.List;

public class RomanToInt {

  public static List<String> list1 = Arrays.asList("I","V","X","L","C","D","M");
  public static List<Integer> list2 = Arrays.asList(1,5,10,50,100,500,1000);

  public static int charToInt(char ss) {
    int number = list2.get(list1.indexOf(String.valueOf(ss)));
    return number;
  }

  public static int romanToInt(String s) {
    int current= 0;
    for (int i=0; i < s.length(); i++) {
      if (i > 0 && charToInt(s.charAt(i)) > charToInt(s.charAt(i-1))) {
        current += charToInt(s.charAt(i)) - 2 * charToInt(s.charAt(i-1));
      } else {
        current += charToInt(s.charAt(i));
      }
    }
    return current;
  }

  public static void main(String[] args) {
    System.out.println(romanToInt("XXI"));  // 21
    System.out.println(romanToInt("MCMXCIV"));  // 1994
  }
}