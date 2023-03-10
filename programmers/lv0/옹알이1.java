public class 옹알이1 {
    private  static String [] four = {"aya", "ye", "woo", "ma"};

    public static boolean isPossible(String babbleWord) {
        String newString = babbleWord;
        for(int i = 0 ; i < 4 ; i++) {
            newString = newString.replace(four[i], " ");
            newString = newString.trim();

        }
        if(newString.isEmpty())
            return true;
        else
            return false;
    }


    public static int solution(String[] babbling) {
        int answer = 0;

        int len = babbling.length;
        for(int i = 0 ; i < len ; i++) {
           if(isPossible(babbling[i]) == true) {
               answer++;
           }
        }

        return answer;
    }

    public static void main(String[] args) {
        String [] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String [] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        int answer = solution(babbling1);
        int answer2 = solution(babbling2);

        System.out.println(answer);
        System.out.println(answer2);
//        String dd  = " ";
//        System.out.println("dd:" + dd + "len is " + dd.length() );
//        System.out.println("dd:" + dd.trim() + "len is " + dd.trim().length() );


    }
}
