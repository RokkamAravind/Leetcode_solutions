class Solution {
    public int subtractProductAndSum(int n) 
    {
        int sum=0;
        int pro=1;
        int result;
        while(n!=0)
        {
            int dig=n%10;
            pro=pro*dig;
            sum=sum+dig;
            n=n/10;
        }
        result=pro-sum;
        return result;
    }
}