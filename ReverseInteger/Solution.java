class Solution {
    public int reverse(int x) {
        int length = (x+"").length();
        int last = 0;
        String first = "";
        for (int i=length-1; i>0; i--){
            first = first+((x+"").charAt(i));
        }
        first =  x>=0 ? first+((x+"").charAt(0)) : first;
        int number = 0;
        try{
        number = Integer.parseInt(first); }
        catch(Exception e ) {
            return 0;
        }
        number = x>=0 ? number : number*-1; 
        return number;
    }
}