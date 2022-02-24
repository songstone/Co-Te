package programmers.lv1;

import java.util.*;

public class GetReportResult {

    public int[] solution(String[] id_list, String[] report, int k) {

        HashMap<String, Set<String>> reportHistory = new HashMap<>();
        report = Arrays.stream(report).distinct().toArray(String[]::new);

        HashMap<String, Integer> reportCount = new HashMap<>();

        for (String id : id_list) {
            Set<String> reportId = new HashSet<>();
            reportHistory.put(id, reportId);
            reportCount.put(id, 0);
        }

        for (String reported : report) {
            String[] check = reported.split(" ");
            reportHistory.get(check[0]).add(check[1]);
            reportCount.put(check[1], reportCount.get(check[1]) + 1);
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            int count = 0;
            for (String check : reportHistory.get(id_list[i])) {
                if (reportCount.get(check) >= k) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
