class Solution {
    public int solution(int n) {
        int n2 = (int) Math.sqrt(n);
        return (n2 * n2 == n) ? 1 : 2;
    }
}
