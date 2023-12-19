import java.util.Scanner;

public class Main {
    private static final int ASCII_SIZE = 128;
    private static final int[] dxs = {0, 1, -1, 0};
    private static final int[] dys = {1, 0, 0, -1};
    private static int nx, ny, r, c, n, nowDirection;
    private static int[] mapper = new int[ASCII_SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        directionMapperInit();

        // TODO 1. 정사각형 격자의 크기 n과 움직이는 시간 t를 입력받는다
        n = sc.nextInt();
        int t = sc.nextInt();

        // TODO 2. 구슬의 현재 좌표 (r, c)와 방향 d를 입력받는다.
        r = sc.nextInt()-1;
        c = sc.nextInt()-1;
        nowDirection = mapper[sc.next().charAt(0)];

        // TODO 3. 현재 좌표를 시작을로 방향에 따라 t 시간 만큼 움직이되, 벽을 만나면 방향을 반전한다.
        move(t);

        // TODO 4. 최종적인 r, c 값을 출력한다.
        System.out.println((r+1) + " " + (c+1));
    }

    private static void directionMapperInit(){
        mapper['D'] = 0;
        mapper['R'] = 1;
        mapper['L'] = 2;
        mapper['U'] = 3;
    }

    private static boolean inRange(int r, int c){
        return (0 <= r && r < n) && (0 <= c && c < n);
    }

    private static void move(int t){
        for (int i = 0; i < t; i ++){
            int nextR = r + dys[nowDirection];
            int nextC = c + dxs[nowDirection];
            if (inRange(nextR, nextC)){
                r = nextR;
                c = nextC;
            }
            else {
                nowDirection = (3 - nowDirection);
            }
        }
    }
}