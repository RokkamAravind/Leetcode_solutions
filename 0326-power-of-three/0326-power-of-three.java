class Solution {
    public boolean isPowerOfThree(int n) {
        boolean bool=powerOfTwo(n);
    
        if(bool){return true;}

        return false;
    }
    public static boolean powerOfTwo(int n) 
    {
        if(n==0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        if(n%3!=0)
        {
            return false;
        }
        return powerOfTwo(n/3);
    }
}