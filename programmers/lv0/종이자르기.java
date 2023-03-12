class Solution {
    public int solution(int M, int N) {
        return M * N - 1;
    }
}

public class 종이자르기 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int tc1 = s.solution(2, 2);
        int tc2 = s.solution(2, 5);
        int tc3 = s.solution(1, 1);
        System.out.println(tc1);
        System.out.println(tc2);
        System.out.println(tc3);
    }
}
