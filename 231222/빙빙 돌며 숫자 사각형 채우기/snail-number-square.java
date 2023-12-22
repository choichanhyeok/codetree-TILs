import java.util.Scanner;

public class Main {
    private static final int MAX_R = 100 + 1;
    private static final int[][] matrix = new int[MAX_R][MAX_R];
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static int r, c, nowDirection, n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. n(row의 크기), m(column의 크기) 입력받기
        n = sc.nextInt();
        m = sc.nextInt();

        // TODO 2. 현재 방향으로 순차적으로 숫자를 채워나가는 메서드 작성 (단, 1. 벽을 만나거나, 2. 다음 위치가 0이 아닐 경우 현재 방향 기준 우회전토록)
        movdAndCheck();

        // TODO 3. 배열의 전체 요소 출력
        printMatrix();

    }

    private static boolean inRange(int x, int y){
        return (0 <= x && x < m) && (0 <= y && y < n);
    }

    private static void movdAndCheck(){
        matrix[r][c] = 1;
        for (int i = 2; i < n*m + 1; i ++){
            int nextR = r + dy[nowDirection];
            int nextC = c + dx[nowDirection];

            if (!inRange(nextC, nextR) || matrix[nextR][nextC] != 0){
                nowDirection = (nowDirection + 1) % 4;
            }

            r += dy[nowDirection];
            c += dx[nowDirection];
            matrix[r][c] = i;
        }
    } 

    private static void printMatrix(){
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j ++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}