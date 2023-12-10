import java.util.Scanner;

// 문제 분석
// 1. n개의 숫자를 입력받고 
// 2. 연속해서 동일한 숫자가 나오는 횟수를 구하라

public class Main {
    // 필요 변수
    private static final int MAX_R = 1000 + 1;
    private static final int[] numbArray = new int[MAX_R];
    
    private static int getMaxSequenceSize(int n){
        int seqCnt = 0;
        int maxSize = 0;
        for (int i = 0; i < n; i ++){
            seqCnt += 1;
            if(i == 0|| numbArray[i] != numbArray[i-1]){
                maxSize = Math.max(maxSize, seqCnt);
                seqCnt = (i == 0)? 1: 0;
            }
        }
        maxSize = Math.max(maxSize, seqCnt);
        return maxSize;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 숫자의 개수 n을 입력
        int n = sc.nextInt();

        // TODO 2. 연속해서 동일한 숫자가 나오는 횟수 구하기
        for (int i = 0; i < n; i ++){
            numbArray[i] = sc.nextInt();
        }

        // TODO 3. 연속해서 동일한 숫자중 크기가 가장 큰 최대값 구하기)
        System.out.println(getMaxSequenceSize(n));
    }
}