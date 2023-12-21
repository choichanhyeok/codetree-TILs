import java.util.Scanner;

public class Main {
    private static final int OFFSET = 50;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int ASCII_NUM = 128;
    private static final int[][] matrix = new int[MAX_R][MAX_R];
    private static final int[] dx = {0, 1, -1, 0};
    private static final int[] dy = {-1, 0, 0, 1};
    private static int r, c, n;
    private static int nowDirection;
    private static int[] mapper = new int[ASCII_NUM];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 정사각형 격자의 변의 길이 n과 구슬의 위치를 보고 싶은 시간 t를 입력
        n = sc.nextInt();
        int t = sc.nextInt();

        // TODO 2. 좌표 (r, c)와 방향(direcion)을 입력받는다.
        r = sc.nextInt() - 1;
        c = sc.nextInt() - 1;
        char direction = sc.next().charAt(0);
        mapper['U'] = 0;
        mapper['D'] = 3;
        mapper['L'] = 2;
        mapper['R'] = 1;
        nowDirection = mapper[direction];

        
        // TODO 3. t 만큼 반복해서 (r, c) 좌표를 움직이되, 벽을 만나면 (inRange()) 방향을 바꾸는 메서드 작성
        move(t);
        

        // TODO 4. 최종 r, c 값 출력
        System.out.println((r+1) + " " + (c+1));

    }

    private static void move(int t){
        for (int i = 0; i < t; i ++){
            int nextX = c + dx[nowDirection];
            int nextY = r + dy[nowDirection];

            if (!inRange(nextX, nextY)){
                nowDirection = 3 - nowDirection;
            } else {
                c = nextX;
                r = nextY;
                
            }
        }
    }

    private static boolean inRange(int x, int y){
        return (0 <= x && x < n) && (0 <= y && y < n);
    }
}