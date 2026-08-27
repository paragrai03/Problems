class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<arr.length;i++){ 
            int count=0;
            for(int bit=0;bit<32;bit++){
               
                if((i&(1<<bit))!=0){
                    count++;

                }
            }
            arr[i]=count;

        }
        return arr;
    }
}