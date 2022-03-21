package programmers.lv1;

import java.util.Arrays;

public class TrainingCloth {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i=0; i<reserve.length; i++) {
            for (int j=0; j<lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = 0;
                    lost[j] = 0;
                    break;
                }
            }
        }
        int count = 0;
        for (int l=0; l<lost.length; l++) {
            if (lost[l] == 0) continue;

            for (int r=0; r<reserve.length; r++) {
                if (reserve[r] == 0) continue;

                if (reserve[r] == lost[l]-1) {
                    reserve[r] = 0;
                    lost[l] = 0;
                    break;
                } else if (reserve[r] == lost[l]+1) {
                    reserve[r] = 0;
                    lost[l] = 0;
                    break;
                }
            }
            if (lost[l] != 0) {
                count++;
            }
        }

        return n-count;
    }
}
