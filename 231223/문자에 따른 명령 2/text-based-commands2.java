import java.util.Scanner;

public class Main {
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static int nx, ny;
    private static int nowDir;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 명령 문자열 입력
        char[] commands = sc.next().toCharArray();

        // TODO 2. 문자열을 하나씩 순회하며 명령대로 움직임
        for (char command: commands){
            move(command);
        }

        System.out.println(nx + " " + ny);
    }

    private static void move(char command){
        if (command == 'L'){
            nowDir = (nowDir - 1 + 4) % 4;
        } 
        else if (command == 'R'){
            nowDir = (nowDir + 1) % 4;
        }
        else {
            nx += dx[nowDir];
            ny += dy[nowDir];
        }

    }
}