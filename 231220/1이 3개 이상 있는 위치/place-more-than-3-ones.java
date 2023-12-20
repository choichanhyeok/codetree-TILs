import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static final int OFFSET = 100;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[][] matrix = new int[MAX_R][MAX_R];
    private static final int[] dxs = new int[]{0, 1, 0, -1};
    private static final int[] dys = new int[]{1, 0, -1, 0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // TODO 1. matrix값 채우기
        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j ++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        // TODO 2. 순회하며 상하좌우 탐색
        bw.write(String.valueOf(countingBetterThenThree(n))); // TODO 4. 대상 노드 개수 출력
        bw.flush();
        bw.close();

    }

    private static int countingBetterThenThree(int n){
        int answer = 0;
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                int count = 0;
                for (int k = 0; k < 4; k ++){ // TODO 3. 상하좌우 3이상인 값 체크
                    if (inRange(i + dxs[k], j + dys[k], n) && matrix[i + dxs[k]][j + dys[k]] == 1)
                        count ++;
                }
                if (count >= 3){
                    answer ++;
                }
            }
        }

        return answer;
    }

    private static boolean inRange(int x, int y, int n){
        return (0 <= x && x < n) && (0 <= y && y < n);
    }
}