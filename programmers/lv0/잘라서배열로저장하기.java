class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int answerLen = 0;

        if (my_str.length() % n == 0) {
            answerLen = my_str.length() / n;
        } else {
            answerLen = my_str.length() / n + 1;
        }
        answer = new String[answerLen];

        for (int i = 0; i < answerLen; i++) {
            if (n * i + n <= my_str.length()) {
                answer[i] = my_str.substring(n * i, n * i + n);
            } else {
                answer[i] = my_str.substring(n * i);
            }

        }
        return answer;
    }

}