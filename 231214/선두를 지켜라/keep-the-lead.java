import java.util.Scanner;

// 문제 분석
// 1. A, B가 동일한 시작점에서 출발
// 2. A, B는 N, M번에 걸쳐 주어지는 특정 속도로 특정 시간 만큼 이동 (방향 x)
// 3. 선두가 바뀌는 횟수를 찾으시오


public class Main {
    // 필요 변수
    private static int MAX_R = 1000000;
    private static int[] runningLogA = new int[MAX_R];
    private static int[] runningLogB = new int[MAX_R];
    private static int nowIdxA = 0;
    private static int nowTimeA = 0;
    private static int nowIdxB = 0;
    private static int nowTimeB = 0;

    private static void loggingRunningLog(int speed, int time, char type){
        if (type == 'A'){
            for (int i = 0; i < time; i ++){
                nowIdxA += speed;
                runningLogA[nowTimeA] = nowIdxA;

                nowTimeA ++;
            }
        }else {
            for (int i = 0; i < time; i ++){
                nowIdxB += speed;
                runningLogB[nowTimeB] = nowIdxB;

                nowTimeB ++;
            }
        }
    }

    private static int howManyLeadChange(){
        int answer = 0;
        int leader = 0;

        for (int i = 0; i < nowTimeA; i ++){
            if (runningLogA[i] < runningLogB[i]){
                if (leader == 1){
                    answer += 1;
                }
                leader = 2;
            }else if(runningLogA[i] > runningLogB[i]){
                if (leader == 2){
                    answer += 1;
                }
                leader = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. N개의 줄에 걸쳐 A의 시간과 속도, M개의 줄에 걸쳐 B의 시간과 속도 입력
        int n = sc.nextInt();
        int m = sc.nextInt();

        // TODO 2. runningLog[]의 각 인덱스는 시간으로 생각하고 그 값을 위치로 생각해 명령에 의해 매 시간 위치가 어떻게 변하는지 기록
        for (int i = 0; i < n; i ++){
            loggingRunningLog(sc.nextInt(), sc.nextInt(), 'A');
        }

        for (int i = 0; i < m; i ++){
            loggingRunningLog(sc.nextInt(), sc.nextInt(), 'B');
        }

        // TODO 3. 선두를 조사하며 선두가 몇 번 바뀌었는지를 추출
        System.out.println(howManyLeadChange());
    }
}