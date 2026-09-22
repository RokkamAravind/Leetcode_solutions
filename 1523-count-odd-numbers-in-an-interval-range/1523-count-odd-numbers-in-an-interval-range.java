class Solution {
    public int countOdds(int low, int high)
    {
        high=(high+1)/2;
        low=low/2;
        int result=high-low;

        return result;
    }
}