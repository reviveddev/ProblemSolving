class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length;
        int d1, d2, r = 0;
        d1 = common[1] - common[0];
        d2 = common[2] - common[1];

        if (d1 == d2) {
            answer = common[len - 1] + d1;
        } else {
            r = common[1] / common[0];
            answer = common[len - 1] * r;
        }
        return answer;
    }
}

public class 다음에올숫자 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] common = {1, 2, 3, 4};
        int[] common2 = {2, 4, 8};

        System.out.println(s.solution(common));
        System.out.println(s.solution(common2));
    }
}
