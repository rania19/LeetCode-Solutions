class Solution {
    public int[] countBits(int n) {
        
      int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
         int numb=0;
         String bin = Integer.toBinaryString(i);
            System.out.println(bin);
            for(int j=0; j< bin.length(); j++){
            if(bin.charAt(j)== '1'){
                numb= numb+1;
            }
            }
            ans[i]=numb;
        }
        
        return ans;
        
    }
}