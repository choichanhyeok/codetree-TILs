import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt(); // K 입력 받음
        int N = sc.nextInt(); // N 입력 받음

        int[] combo = new int[N];
        generateCombinations(1, K, N, combo, 0);

        sc.close(); // 스캐너 사용 종료
    }

    public static void generateCombinations(int start, int K, int N, int[] combo, int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) { // 모든 조합의 요소를 출력
                System.out.print(combo[i] + " ");
            }
            System.out.println(); // 한 조합이 끝날 때마다 줄바꿈
            return;
        }

        for (int i = 1; i <= K; i++) { // i는 항상 1부터 시작해야 모든 숫자 조합을 만들 수 있음
            combo[depth] = i;
            generateCombinations(start, K, N, combo, depth + 1); // 다음 요소를 결정하기 위해 재귀 호출
        }
    }
}