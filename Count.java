class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int ans=0;
        for(int i=1;i<=n;i++){
            String s=Integer.toString(i);
            for(int x=0; x<s.length();x++){
                if(s.charAt(x)=='4'){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
