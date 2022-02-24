package programmers.lv1;

public class NumberWord {
    public int solution(String s) {

        String[] english = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < english.length; i++) {
            s = s.replaceAll(english[i], number[i]);
        }

        int answer = Integer.parseInt(s);
        return answer;
    }
}
