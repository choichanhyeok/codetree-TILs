import java.util.Scanner;

// 문제 분석
// 1. 직선상에 선분이 놓여 있음 _______________xxxx____ : n은 무조건 양수
// 2. 가장 많이 겹치는 곳에서 몇개의 선분이 겹치는지 구하시오.
// 3. 단, 끝점 닿는 경우도 겹치는 것으로 보기

public class Main {
    // 필요 변수
    private static int n;
    private static final int MAX_R = 100 + 1;
    private static final int[] checked = new int[MAX_R];

    private static void drawLine(int a, int b){
        for(int i = a; i <= b; i++){
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

        // TODO 1. 선분의 개수 n입력
        n = sc.nextInt();

        // TODO 2. n개의 선분을 입력받기
        for (int i = 0; i < n; i ++){
            // TODO 3. 입력받은 각각의 선분을 checked에 기록 (+=1 방식으로)
            drawLine(sc.nextInt(), sc.nextInt());
        }
        // TODO 4. 가장 많이 겹치는 선분의 크기 구하기
        System.out.println(getMaxValue());
    }
}