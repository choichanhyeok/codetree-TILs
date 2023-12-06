import java.util.Scanner;

// 문제 분석
// 1. 0에서 시작해서 n번의 명령에 걸쳐 움직인다.
// 2. 2번 이상 지나간 영역의 크기를 출력하는 프로그램을 작성하라

public class Main {
    // 필요 변수
    private static final int OFFSET = 100;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int commandLimit = 100;
    private static final int[] checked = new int[MAX_R];
    private static final int[] x1 = new int[commandLimit];
    private static final int[] x2 = new int[commandLimit];
    private static int curIdx = OFFSET;

    private static void loggingSegment(int distance, char direction, int logIdx){
        
        if (direction == 'R'){
            x1[logIdx] = curIdx;
            x2[logIdx] = curIdx + distance;

            curIdx = x2[logIdx];
        }
        else {
            x1[logIdx] = curIdx - distance;
            x2[logIdx] = curIdx;

            curIdx = x1[logIdx];
        }
    }

    private static void drawAtChecked(int x1, int x2){
        for (int i = x1; i < x2; i ++){
            checked[i] += 1;
        }
    }

    private static int betterThanMore2(){
        int answer = 0;
        for (int i = 0; i < MAX_R; i ++){
            if(checked[i] >= 2){
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 명령의 개수 n을 입력
        int n = sc.nextInt();
        checked[0] = 1;

        // TODO 2. n번 반복하며 명령을 받고 해당 명령의 세그먼트를 기록해준다
        for (int i = 0; i < n; i ++){
            loggingSegment(sc.nextInt(), sc.next().charAt(0), i);
        }

        // TODO 3. 각각의 세그먼트들을 순회하며 drawing
        for (int i = 0; i < n; i ++){
            drawAtChecked(x1[i], x2[i]);
        }

        // TODO 4. checked[]를 순회하며 2이상인 개수를 찾아 추출
        System.out.println(betterThanMore2());
    }
}