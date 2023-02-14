class Solution {
    public static int getDecimal(String binary) {
        int sum = 0;
        for (int i=0; i<binary.length(); i++) {
            int ilk = binary.charAt(binary.length()-1-i)-'0';
            sum = sum + (ilk* ((int) Math.pow(2,i)));
        }
        return sum;
    }
    public static String getBinary(int decimal) {
        int bolum = decimal;
        String kalan = "";
         if (bolum == 0) return "0";
        while (bolum > 0) {
            kalan = bolum%2+kalan;
            bolum = bolum/2;
        }
        return kalan;
    } 
    public String addBinary(String a, String b) {
        int sum = getDecimal(a)+getDecimal(b);


        return getBinary(sum);
    }
}