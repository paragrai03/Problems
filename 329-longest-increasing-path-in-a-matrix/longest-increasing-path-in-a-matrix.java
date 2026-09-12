class Solution {
    public int value(int[][] matrix,int i,int j,int m,int n,int[][] dp){
       
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int c1=0;int c2=0;int c3=0;int c4=0;
        //up check
        if( i<m-1&&matrix[i+1][j]>matrix[i][j]){
             c1=value(matrix,i+1,j,m,n,dp);
        }
 
        //down
           if(i>0&&matrix[i-1][j]>matrix[i][j]){
             c2=value(matrix,i-1,j,m,n,dp);
        }
  
        //left
           if( j<n-1&&matrix[i][j+1]>matrix[i][j]){
             c3=value(matrix,i,j+1,m,n,dp);
        }

           if(j>0&&matrix[i][j-1]>matrix[i][j]){
             c4=value(matrix,i,j-1,m,n,dp);
        }
   
       return dp[i][j]= 1+Math.max(c1,Math.max(c2,Math.max(c3,c4)));

    }

    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] dp=new int[m][n];
     for(int i=0;i<dp.length;i++){
        Arrays.fill(dp[i],-1);

     }  
int ans=0;
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        ans=Math.max(ans,value(matrix,i,j,m,n,dp));
    }
}
return ans;

        
    }
}