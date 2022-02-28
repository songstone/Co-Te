package programmers.lv1;

public class Keypad {
    public String solution(int[] numbers, String hand) {

        StringBuilder sb = new StringBuilder();

        int leftFinger = -1;
        int rightFinger = -2;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                leftFinger = num;
                sb.append("L");
            } else if (num == 3 || num == 6 || num == 9) {
                rightFinger = num;
                sb.append("R");
            } else {
                int leftD = getDistance(leftFinger, num);
                int rightD = getDistance(rightFinger, num);

                if (leftD > rightD) {
                    rightFinger = num;
                    sb.append("R");
                } else if (rightD > leftD) {
                    leftFinger = num;
                    sb.append("L");
                } else {
                    if (hand.equals("left")) {
                        leftFinger = num;
                        sb.append("L");
                    } else {
                        rightFinger = num;
                        sb.append("R");
                    }
                }
            }
        }

        String answer = sb.toString();
        return answer;
    }

    private int getDistance(int a, int b) {
        int[] aPoint = getPoint(a);
        int[] bPoint = getPoint(b);

        return Math.abs(aPoint[0] - bPoint[0]) + Math.abs(aPoint[1] - bPoint[1]);
    }

    private int[] getPoint(int a) {
        int[] point = new int[2];

        if (a == 0) {
            point[0] = 3;
            point[1] = 1;
        } else if (a == -1) {
            point[0] = 3;
            point[1] = 0;
        } else if (a == -2) {
            point[0] = 3;
            point[1] = 2;
        } else {
            point[0] = (a - 1) / 3;
            point[1] = (a - 1) % 3;
        }
        return point;
    }
}
