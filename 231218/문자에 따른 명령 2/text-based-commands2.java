import java.util.Scanner;

public class Main {
    private static final int[] dx = new int[]{0, 1, 0, -1};
    private static final int[] dy = new int[]{1, 0, -1, 0};
    private static int nx, ny;

    private static void moveBasedOnCommand(String commands){
        int dirIdx = 0;
        for (char command: commands.toCharArray()){
            if (command == 'L')
                dirIdx = (dirIdx - 1 + 4) % 4;
            else if (command == 'R')
                dirIdx = (dirIdx + 1) % 4;
            else if (command == 'F'){
                nx += dx[dirIdx];
                ny += dy[dirIdx];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 명령의 집합 입력받기
        String commands = sc.next();

        // TODO 2. 명령에 따라 이동
        moveBasedOnCommand(commands);

        System.out.println(nx + " " + ny);
    }
}