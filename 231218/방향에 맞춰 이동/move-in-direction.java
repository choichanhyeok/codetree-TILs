import java.util.Scanner;

// 문제 분석
// 1. (0, 0)에서 N번 움직이려고 한다
// 2. N번에 걸쳐 움직이는 방향과 거리가 주어졌고
// 3. 최종 위치를 출력하는 프로그램을 작성하라

public class Main {
    private static final int OFFEST = 1000;
    private static final int MAX_R = OFFEST * 2 + 1;
    private static final int[][] matrix = new int[MAX_R][MAX_R];
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static int nx, ny;

    private static final void move(char direction, int distance){
        if (direction == 'N'){
            nx += dx[0] * distance;
            ny += dy[0] * distance;
        }else if (direction == 'E'){
            nx += dx[1] * distance;
            ny += dy[1] * distance;
        }else if (direction == 'S'){
            nx += dx[2] * distance;
            ny += dy[2] * distance;
        }else{
            nx += dx[3] * distance;
            ny += dy[3] * distance;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO 1. n번에 걸쳐 움직이는 방향과 거리
        for (int i = 0; i < n; i ++){
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            // TODO 2. 명령에 따라 nx, ny 위치 적용해주기
            move(direction, distance);
        }

        // TODO 3. 현재 nx, ny의 값 출력
        System.out.println(nx + " " + ny);

    }
}