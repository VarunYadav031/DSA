class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int temp=n;
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        if(rev==temp){
            return true;
        }else{
            return false;
        }
    }
}