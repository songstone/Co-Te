package programmers.lv1;

import java.util.Stack;

public class CraneDoll {
    public int solution(int[][] board, int[] moves) {

        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        int answer = 0;

        for(int i : moves) {
            for(int[] list : board) {
                if(list[i-1] != 0) {
                    if(stack.peek() != list[i-1]){
                        stack.push(list[i-1]);
                    }
                    else if (stack.peek() == list[i-1]) {
                        stack.pop();
                        answer += 2;
                    }
                    list[i-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
