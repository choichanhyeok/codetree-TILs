import java.util.Scanner;


// 문제 분석
// ㅁㅁㅁㅁ .. n 
// -> n개의 집이 존재함

// 집에는 각각 다른 수의 사람들이 살고 있음 예컨대
// 3 5 4 1 9 .. n
// 회의를 위해서 n개의 집중에 한 곳에 전부 모여야함


public class Main {
    private static final int MAX_R = 101;
    private static final int[] line = new int[];
    private static int MIN_VALUE = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 집의 개수 n을 입력받는다.
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++){
            line[i] = sc.nextInt();
        }


        // TODO 2. 0부터 n까지 i를 증가시키며 i 번째 인덱스를 피봇으로 둘 때의 움직인 거리의 총량을 MIN_VALUE와 비교한다.
        getMinCost();

        // TODO 3. 최종적으로 추출된 MIN_VALUE를 출력한다.
        System.out.println(MIN_VALUE);
    }

    private static void int getMinCost(){
        for (int i = 0; i < n; i ++){
            int nowCost = Integer.MAX_VALUE;

            for (int i = 0; i < j; i ++){
                if (i == j) continue;
                
                nowCost += Math.abs(i-j) * line[j];
            }

            MIN_VALUE = Math.min(MIN_VALUE, nowCost);
        }   
    }
}