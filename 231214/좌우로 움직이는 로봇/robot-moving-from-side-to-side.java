import java.util.Scanner;

public class Main {
    private static final int MAX_R = 50000;
    private static final int[] moveLogA = new int[MAX_R];
    private static final int[] moveLogB = new int[MAX_R];
    private static int n, m;
    private static int idxA = 1, idxB = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 로봇이 움직인 횟수 n과 m 저장
        n = sc.nextInt();
        m = sc.nextInt();

        // TODO 2. n줄에 걸쳐 주어진 움직임 정보 기반으로 로봇 a의 좌표기록 저장
        for (int i = 0; i < n; i ++){
            int time = sc.nextInt();
            char direction = sc.next().charAt(0);

            writeLog(time, direction, 'A');
        }

        // TODO 3. m줄에 걸쳐 주어진 움직임 정보 기반으로 로봇 b의 좌표기록 저장
        for (int i = 0; i < n; i ++){
            int time = sc.nextInt();
            char direction = sc.next().charAt(0);

            writeLog(time, direction, 'B');
        }

        // TODO 4. 두 로봇의 총 움직인 시간의 총 합 중 더 작은 크기를 기준으로 순회, 
        int answer = 0;
        int searchSize = Math.min(idxA, idxB);
        for (int i = 1; i < searchSize-1; i ++){
            // TODO 5. 순회 과정에서 직전에는 다른 위치에 있다가 현재 같은 위치에 있는 경우의 수를 센다.
            if (moveLogA[i] != moveLogB[i] && moveLogA[i+1] == moveLogB[i+1]){
                answer ++;
            }
        }

        System.out.println(answer);
    }

    private static void writeLog(int time, char direction, char type){
        if (type == 'A'){
            for (int i = 0; i < time; i ++){
                moveLogA[idxA] = moveLogA[idxA-1] + (direction == 'L'? -1: 1);
                idxA ++;
            }
        }
        else{
            for (int i = 0; i < time; i ++){
                moveLogB[idxB] = moveLogB[idxB-1] + (direction == 'L'? -1: 1);
                idxB ++;
            }
        }
    }
}