import java.util.Scanner;

// 문제 분석
// 1. _______________ .. 무한이 나열된 1차원 좌표 존재,
// 2. 아무 타일에서 시작해 n번의 명령에 걸쳐 움직임
// 3. 명령은 X L, X R 형태
// 4. 왼쪽의 경우 흰색으로 타일 칠함, 오른쪽의 경우 검은색으로 타일 칠함
// 5. 검은색, 흰색 각각 두개 이상은 회색
// 6. 흰색, 검은색, 회색의 타일 수를 각각 출력하시오.
public class Main {
    private static final int OFFSET = 100000;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[] checked = new int[MAX_R];
    private static final int[] checkedWiteCnt = new int[MAX_R];
    private static final int[] checkedBlackCnt = new int[MAX_R];
    private static int curIdx = OFFSET;

    private static void drawBox(int distance, char direction){
        if (direction == 'L'){
            while(distance-- > 0){
                checked[curIdx] = 1;
                checkedWiteCnt[curIdx] += 1;
                if(distance > 0) curIdx--;
            }
        }else{
            while(distance -- > 0){
                checked[curIdx] = 2;
                checkedBlackCnt[curIdx] += 1;
                if(distance > 0) curIdx++;
            }
        }
    }

    // 필요 변수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO 1. n개의 명령을 받아 checked, checkedWiteCnt, checkedBlackCnt에 기록
        int n = sc.nextInt();
        for (int i = 0; i < n; i ++){
            int distance = sc.nextInt();
            char direction = sc.next().charAt(0);

            drawBox(distance, direction);
        }

        int b = 0;
        int w = 0;
        int g = 0;
        // TODO 2. 기록된 checked를 순회하며 검은색, 흰색, 회색의 개수를 찾음
        for (int i = 0; i < MAX_R; i ++){
            if(checkedBlackCnt[i] >= 2 && checkedWiteCnt[i] >= 2) g ++;
            else if(checked[i] == 1) w ++;
            else if(checked[i] == 2) b ++;
        }
        System.out.print(w + " " + b + " " + g);
    }
}