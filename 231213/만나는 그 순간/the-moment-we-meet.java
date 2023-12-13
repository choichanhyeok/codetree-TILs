import java.util.Scanner;

// 문제 분석
// 1. A와 B는 동일한 시작점에서 출발
// 2. 각각 N, M번에 걸쳐 움직인다.
// 3. 시간 기준으로 각 배열에 위치 값을 저장한 뒤
// 4. 같은 시간에 같은 위치 (같은 index에 같은 value)를 갖는 곳을 찾는다. (없을시 -1)

public class Main {
    // 필요 변수
    private static final int OFFSET = 1000000;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[] positionA = new int[MAX_R];
    private static final int[] positionB = new int[MAX_R];
    private static final boolean isA = true;
    private static final boolean isNotA = false;
    private static int time = 1;
    private static int endPoint = 0;

    private static void setPositionByTimeAndDirection(char direction, int distance, boolean isA){        
        while (distance-- > 0){
            if (isA){
                positionA[time] = positionA[time-1] + ((direction == 'R')? 1: -1); 
                time ++;
            }else{
                positionB[time] = positionB[time-1] + ((direction == 'R')? 1: -1);
                time ++;
            }
        }
        endPoint = time;
    }

    private static int getFirstMeet(){
        int answer = -1;
        for (int i = 1; i < time ; i++){
            if (positionA[i] == positionB[i]){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO 1. N과 M을 입력받는다.
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // TODO 2. direction과 distance를 입력받아 시간 배열 positionA, positionB에 현재 위치들을 저장
        for (int i = 0; i < n; i ++){
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            setPositionByTimeAndDirection(direction, distance, isA);
        }

        time = 1; // time 1로 초기화
        for (int i = 0; i < m; i ++){
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            
            setPositionByTimeAndDirection(direction, distance, isNotA);
        }

        // TODO 3. 저장된 위치들 중 같은 시간에 같은 위치를 갖는 곳의 첫 위치를 출력한다. (없으면 -1)
        System.out.println(getFirstMeet());
    }
}