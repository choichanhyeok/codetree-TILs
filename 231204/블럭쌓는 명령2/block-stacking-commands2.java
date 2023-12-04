import java.util.Scanner;

// 문제 분석
// (1) 1번 칸 부터 N번 칸 까지 총 N개의 칸 존재: ㅁㅁㅁㅁㅁㅁ .. N
// (2) A번째 칸부터 B번째 칸까지 각각 블럭을 1씩 쌓아라  - ** 주요 조건
// (3) 명령 수행 이후 1번 칸부터 n번칸 까지 쌓인 블럭중 가장 큰 값 출력 


public class Main {
    // 필요 전역 변수
    // 1. 정답 배열 checked[]
    // 2. 배열의 크기 MAX_R: N의 크기가 100 이므로 100 + 1
    // 3. 입력받은 블록의 크기 n

    private static final int MAX_R = 100 + 1;
    private static final int[] checked = new int[MAX_R];
    private static int n;

    private static void drawToCheckedArray(int a, int b){
        for (int i = a; i < b+1; i ++){
            checked[i] += 1;
        }
    }

    private static int getMaxValue(){
        int maxValue = 0;
        for (int i = 0; i < n; i ++){
            maxValue = Math.max(maxValue, checked[i]);
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. N(블럭 limit), K(명령의 개수) 입력
        n = sc.nextInt();
        int k = sc.nextInt();

        // TODO 2. K번의 명령 입력
        for (int i = 0; i < k; i ++){
            int sectionA = sc.nextInt();
            int sectionB = sc.nextInt();

            // TODO 3. 입력받은 범위 K(a, b)에 따라 정답배열(checked)에 시뮬레이션
            drawToCheckedArray(sectionA, sectionB);
        }

        // TODO 4. 정답배열(checked)를 순회하며 최대 값 추출
        System.out.println(getMaxValue());

    }
}