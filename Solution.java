class Solution {
    public boolean isPalindrome(int x) {
        int pal=0;
        int copy=x;
        if(x<0)
        return false;
        while(x!=0)
        { 
            pal=10*pal+x%10;
            x=x/10;
              }
              if(pal==copy)
              return true;
              else
              return false;
    }
}
