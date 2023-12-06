import java.util.Scanner;

// 문제 분석
// 1차원 직선상에 선분이 놓여있음 (직선은 음수 포함) -> OFFSET 필요
// 선분을 입력받아 (구간) 몇개의 선분이 겹치는지를 구하는 프로그램 작성하라.
// 단, 끝점에서 닿는 경우는 겹치는 것으로 생각 안함

public class Main {
    // 필요 전역 변수
    private static final int OFFSET = 100;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[] checked = new int[MAX_R];
    private static int n;

    private static void drawToCheckedArray(int start, int end){
        for (int i = start; i < end; i ++){
            checked[i] += 1;
        }
    }

    private static int getMaxValue(){
        int maxValue = 0;

        for (int i = 0; i < MAX_R; i ++){
            maxValue = Math.max(maxValue, checked[i]);
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 선분의 개수 n 입력
        n = sc.nextInt();

        // TODO 2. n개의 선분 입력
        for (int i = 0; i < n; i ++){
            int startPoint = sc.nextInt() + OFFSET;
            int endPoint = sc.nextInt() + OFFSET;

            // TODO 3. n개의 선분을 checked[]에 기록 (단, 끝점에서 닿는건 기록치 않음)
            drawToCheckedArray(startPoint, endPoint);
        }

        // TODO 4. 최대로 겹치는 구간의 선분 개수 (그냥 겹치는 최대값 도출)
        System.out.println(getMaxValue());
    }
}