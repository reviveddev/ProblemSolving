class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a = total / num + (1 - num) / 2;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = a + i;
        }
        return answer;
    }
}

public class 연속된수의합 {
    public static void printArr(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(3, 12);
        printArr(answer);

    }
}
