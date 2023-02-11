class Solution {    
    public String longestCommonPrefix(String[] strs) {
      int minimumlength = strs[0].length();
      String returnstring = "";
      for (int i = 0; i < strs.length; i++) {
        minimumlength = strs[i].length() < minimumlength ? strs[i].length() : minimumlength;
      }
      String laststring = "";
      for (int a = 1; a <= minimumlength; a++) {

        String firststring = strs[0].substring(0, a);
        int addchar = 0;
        for (int i = 0; i < strs.length; i++) {
          if (strs[i].substring(0, a).equals(firststring)) {
            addchar++;
          }

          if (addchar == strs.length) {
            laststring = firststring;
          }

        }
      }

      return laststring;
    }

public static void main(String[] args) {
  Solution sol = new Solution();
  String[] strs = {"hello", "hell", "heaven"};
  System.out.println(sol.longestCommonPrefix(strs));
}

}