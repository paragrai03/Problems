class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        int i=0;
        int ans=0;
        while(j<s.length){
            if(i>=g.length){
                break;
            }
            if(s[j]>=g[i]){
                ans+=1;
                j++;
                i++;
            }
            else{  j++;}
          
        }

       return ans; 
    }
}