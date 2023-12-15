import java.util.Scanner;


public class Main {
    private static final int OFFSET = 1000;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[][] matrix = new int[MAX_R][MAX_R];
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {1, 0, -1, 0};
    private static int nx, ny;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++){
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            // TODO 1. 방향과 거리 기반으로 움직임 nx, ny 업데이트
            move(direction, distance);
        }

        // TODO 2. 현재 위치 (nx, ny) 출력
        System.out.println(nx + " " + ny);
        
    }

    private static void move(char direction, int distance){
        int nowDirection;

        if (direction == 'N'){
            nowDirection = 0;
        } else if (direction == 'E'){
            nowDirection = 1;
        } else if (direction == 'S'){
            nowDirection = 2;
        } else {
            nowDirection = 3;
        }

        nx += dx[nowDirection] * distance;
        ny += dy[nowDirection] * distance;
    }
}