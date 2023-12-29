import java.util.Scanner;

public class Main {
    private static final int MAX_R = 100;
    private static final int[][] matrix = new int[MAX_R][MAX_R];
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {-1, 0, 1, 0};
    private static int nowDirection = 1;
    private static int r, c = 0;
    private static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO 1. n과 m의 값 입력
        n = sc.nextInt();
        m = sc.nextInt();

        // TODO 2. n과 m을 순회하며 1씩 추가, (순회 방법은 (1) 벽을 만났을 시 방향 오른쪽 회전(inRange), (2) 이미 지나온 길을 만났을 시 오른쪽 회전(nextVal != 0))
        move();
        printMatrix();
    }

    private static boolean inRange(int r, int c){
        return (0 <= r && r < n) && (0 <= c && c < m);
    }

    private static void move(){
        matrix[r][c] = 1;
        for (int i = 2; i <= n * m; i ++){
            int nextR = r + dy[nowDirection], nextC = c + dx[nowDirection];

            if (!inRange(nextR, nextC) || (matrix[nextR][nextC] != 0)){
                nowDirection = (nowDirection + 1) % 4;
            }

            c = c + dx[nowDirection]; r = r + dy[nowDirection];
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