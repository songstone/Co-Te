package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {

        int[] lotto_result = {6,6,5,4,3,2,1};

        List<Integer> list = new ArrayList<>();
        for (int num : win_nums) {
            list.add(num);
        }

        int zero_count = 0;
        int correct_count = 0;

        for(int my_num : lottos){
            if(my_num == 0)
                zero_count++;
            else if(list.contains(my_num))
                correct_count++;
        }
        int[] answer = {lotto_result[correct_count + zero_count], lotto_result[correct_count]};
        return answer;
    }
}
