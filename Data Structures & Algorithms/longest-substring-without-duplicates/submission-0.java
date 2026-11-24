class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1)
            return s.length();
        int[] letters = new int[128];

        int l=0;
        int r=1;

        int max=1;
        letters[s.charAt(l)] = 1;
        while(r<s.length())
        {
            while(r<s.length() && letters[s.charAt(r)]==0)
            {
                max = Math.max(r-l+1, max);
                letters[s.charAt(r)]=1;
                r++;
            }

            if (r == s.length())
            break;
            while (letters[s.charAt(r)] != 0) {
                letters[s.charAt(l)] = 0;
                l++;
            }
        }

        return max;
    }
}
