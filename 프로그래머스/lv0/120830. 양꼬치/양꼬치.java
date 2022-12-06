class Solution {
    public int solution(int n, int k) {
        for (int i = 0; i <= n; i++) {
            if (i % 10 == 0) k--;
        }
        
        return (n*12000) + (k*2000 + 2000);
    }
}