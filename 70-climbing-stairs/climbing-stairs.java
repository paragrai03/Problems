class Solution {
    public int climb(int n,int i,int[] dp){
        if(i<0){
            return 0;
        }
        if(i==0){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int a1=climb(n,i-1,dp);
        int a2=climb(n,i-2,dp);
        return dp[i]=a1+a2;
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        
            Arrays.fill(dp,-1);
        
  return climb(n,n,dp);

        
    }
}