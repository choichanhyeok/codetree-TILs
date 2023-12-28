import java.util.Scanner;

public class Main {
    private static final int MAX_N = 100;
    private static int n, m, answer;
    private static final int[][] matrix = new int[MAX_N][MAX_N];
    private static final int[] seq = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 0. 격자의 크기 n과, 행복한 수의 기준이 될 m 값을 입력받는다. 
        n = sc.nextInt();
        m = sc.nextInt();

        // TODO 0. n by n 크기의 격자 요소를 입력받는다.
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                matrix[i][j] = sc.nextInt();
            }
        }


        // TODO 1. 모든 행과 열을 한번씩 순회한다. 
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                seq[j] = matrix[i][j];
            }

            if (isHappySeq()) answer ++;
        }

        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                seq[j] = matrix[j][i];
            }

            if (isHappySeq()) answer ++;
        }


        // TODO 3. 총 행복한 수열(answer)의 값을 출력한다.
        System.out.println(answer);

    }

    // TODO 2. 순회 과정에서 연속해서 나오는 수의 최대값을 구하고, 2가 넘으면 answer += 1 을 한다.
    private static boolean isHappySeq(){
        int maxCnt = 1;
        int nowCnt = 1;

        for (int i = 1; i < n; i ++){
            if (seq[i] == seq[i-1]) nowCnt ++;
            else nowCnt = 1;

            maxCnt = Math.max(maxCnt, nowCnt);
        }

        return maxCnt >= m;
    }
}