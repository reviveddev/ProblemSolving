class Solution {
    public String solution(String my_string) {
        char[] temp = my_string.toLowerCase().toCharArray(); // bcad
        int len = temp.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (temp[i] < temp[j]) {
                    continue;
                } else {
                    char ch = temp[i];
                    temp[i] = temp[j];
                    temp[j] = ch;
                }
            }
        }
        return String.valueOf(temp);
    }
}