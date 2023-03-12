class Solution {
    public int solution(String A, String B) {
//        int answer = 0;
//        int len = A.length();
//        if (A.equals(B)) {
//            return answer;
//        }
//
//        for (int i = 0; i < len; i++) {
//            String str = "";
//            str += A.charAt(len -1);
//            for (int j = 0; j < len - 1; j++) {
//                str += A.charAt(j);
//            }
//            answer++;
//            A = str;
//            System.out.println(str);
//            if(str.equals(B)) {
//                return answer;
//            }
//        }
//        return -1;

        //String tempB = B.repeat(3);
        return B.concat(B).indexOf(A);
    }
}

public class 문자열밀기 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int tc1 = s.solution("hello", "ohell");
        System.out.println(tc1);

        int tc2 = s.solution("balcke", "ckebal");
        System.out.println(tc2);
    }
}
