class Solution {
    public int countOdds(int low, int high) {

    int numbers = high - low + 1;

    if(low%2 != 0 && high%2 != 0) {
        return (int)(numbers/2) +1;
    }
    if(low%2 == 0 && high%2 ==0) {
        return (int)(numbers/2);
    }
    return numbers/2;
    }
}