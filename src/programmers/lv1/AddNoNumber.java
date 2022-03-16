package programmers.lv1;

import java.util.Arrays;
import java.util.HashSet;

public class AddNoNumber {
    public int solution(int[] numbers) {

        HashSet<Integer> chkList = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int num : numbers) {
            chkList.remove(num);
        }
        int answer = chkList.stream().mapToInt(Integer::intValue).sum();
        return answer;
    }
}
