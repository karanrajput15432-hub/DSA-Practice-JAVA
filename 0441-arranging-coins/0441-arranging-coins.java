class Solution {
    public int mySqrt(long x) {
        if(x==0) return 0;
        long lo=0;
        long hi=x;

        while(lo<=hi){
            long mid= lo + (hi-lo)/2;

            if(mid == x/mid) return (int)mid;
            else if(mid > x/mid) hi=mid-1;
            else lo=mid+1;
        }
        return (int)hi;
    }

    public int arrangeCoins(int n) {
        long m=(long)n;
        int k=(mySqrt(8*m+1)-1)/2;
        return k;
    }
}