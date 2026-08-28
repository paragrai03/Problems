

        class Solution {
    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            ans = (ans << 1) | bit;
            n = n >>> 1;
        }

        return ans;
    }
}
    

//Remember:

//n & 1 → get last bit
//ans << 1 → make space for new bit
//| bit → put the bit into ans
//n >>> 1 → remove last bit
//Repeat 32 times.