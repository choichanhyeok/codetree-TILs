import java.util.Scanner;


// 문제 분석
// (1) 좌표평면 위에 -> 2차원 배열 matrix[][] 필요
// (2) 직사각형 A, B를 붙이고 -> matrix에 해당 범위에 체크해주고
// (3) 그 위에 직사각형 M을 붙임 -> matrix에 M의 범위도 체크 +1
// (4) M으로 덮이지 않은 A, B의 크기 구하기 -> 1의 개수
// + OFFSET 필요

public class Main {
    // 필요 변수
    private static final int OFFSET = 1000;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[][] matrix = new int[MAX_R][MAX_R];

    private static void drawSquare(int x1, int y1, int x2, int y2, int x){
        for (int i = x1; i < x2; i ++){
            for (int j = y1; j < y2; j++){
                matrix[i][j] = (x == 0 || x == 1) ? 1: 2;
            }
        }
    }

    private static int getOnlyABRange(){
        int answer = 0;

        for (int i = 0; i < MAX_R; i ++){
            for (int j = 0; j < MAX_R; j ++){
                if (matrix[i][j] == 1){
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. A, B, M 사각형의 좌표 구하기
        for (int i = 0; i < 3; i ++){
            // TODO 2. matrix에 기록하기
            drawSquare(sc.nextInt() + OFFSET, sc.nextInt() + OFFSET, sc.nextInt() + OFFSET, sc.nextInt() + OFFSET, i);
        }

        // TODO 3. M과 겹치지 않는 A, B의 범위 구하기 (1의 개수)
        System.out.println(getOnlyABRange());

    }
}