class Solution {
    
    
         int sum(int n){
            int sum = 0;
            while(n>0){
            int digit = n%10;
            sum = sum + digit*digit;
            n = n/10;
        }
        return sum;
        }
        public boolean isHappy(int n) {
        int slow=n;
        int fast = n;

        Solution sol = new Solution();
        while(slow!=1){
            slow = sol.sum(slow);
            fast = sol.sum(fast);
            fast = sol.sum(fast);
            if(slow==fast && slow!=1){
                return false;
            }
            
        }
        return true;
    }
}