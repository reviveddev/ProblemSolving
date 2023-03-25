import java.sql.DatabaseMetaData;

class OX퀴즈 {
    public static String[] solution(String[] quiz) {
        int length = quiz.length;
        int step = 0;
        String left = "";
        String mid = "";
        String right = "";
        String dab = "";
        String[] answer = new String[length];
        // "19 - 6 = 13"

        for (int i = 0; i < length; i++) {
            step = 0;
            left = "";
            mid = "";
            right = "";
            dab = "";

            String expression = quiz[i];
            for (int j = 0; j < expression.length(); j++) {
                if (expression.charAt(j) == ' ') {
                    step++;
                    continue;
                }

                if (step == 0) {
                    left = left + expression.charAt(j); // "" 필요없나?
                } else if (step == 1) {
                    mid = mid + expression.charAt(j);
                } else if (step == 2) {
                    right = right + expression.charAt(j);
                } else if (step == 4) {
                    dab = dab + expression.charAt(j);
                }
            }
            if (mid.equals("+")) {
                if (Integer.parseInt(left) + Integer.parseInt(right) == Integer.parseInt(dab)) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (mid.equals("-")) {
                if (Integer.parseInt(left) - Integer.parseInt(right) == Integer.parseInt(dab)) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        System.out.println("left = " + left + " mid = " + mid + " right = " + right + ", dab = " + dab);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println();
        String[] quiz = { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" };
        String[] dab = solution(quiz);
        for (int i = 0; i < dab.length; i++) {
            System.out.print(dab[i] + "    ");
        }
        // System.out.println(dab.length s\);
        // System.out.println(Integer.valueOf("-3 + 4") + Integer.valueOf("7"));

    }
}