import java.util.Scanner;

// 문제 분석
// 1. 0이 아닌 N개의 숫자가 주어짐
// 2. 부호가 동일한 숫자로 이루어진 연속 부분 수열 탐색
// 3. 가장 큰 연속 부분 수열의 길이 출력

public class Main {
    // 필요 변수
    private static final int MAX_R = 1000 + 1;
    private static final int[] numbArray = new int[MAX_R];

    private static int getMaxSequencLength(int n){
        int seqCnt = 0;
        int maxValue = 0;
        boolean isPlus;

        for (int i = 0; i < n; i++){
            isPlus = (numbArray[i] > 0);
            seqCnt += 1;
            if (i == 0 || (0 < numbArray[i-1]) != isPlus){
                maxValue = Math.max(maxValue, seqCnt);
                seqCnt = (i == 0)? 1: 0;
            }
        }

        maxValue = Math.max(maxValue, seqCnt);
        return maxValue;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 숫자들의 개수 n 값 입력
        int n = sc.nextInt();

        // TODO 2. n개의 숫자를 배열에 세팅
        for (int i = 0; i < n; i ++){
            numbArray[i] = sc.nextInt();
        }

        // TODO 3. 음양을 구분해 부분 수열 탐색, 각각의 길이를 확인해 최대 값 추출
        System.out.println(getMaxSequencLength(n));
    }
}