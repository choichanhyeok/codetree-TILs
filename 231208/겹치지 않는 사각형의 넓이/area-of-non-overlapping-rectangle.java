import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static final int OFFSET = 1000;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[][] matrix = new int[MAX_R][MAX_R];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 2; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j < x2; j ++){
                for (int k = y1; k < y2; k++){
                    matrix[j][k] ++;
                }
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        for (int j = x1; j < x2; j ++){
            for (int k = y1; k < y2; k++){
                matrix[j][k] += 100;
            }
        }
        br.close();

        int notInterserctionArea = 0;
        for (int i = 0; i < MAX_R; i ++){
            for (int j = 0; j < MAX_R; j ++){
                if (matrix[i][j] != 0 && matrix[i][j] < 100){
                    notInterserctionArea ++;
                }
            }
        }

        bw.write(String.valueOf(notInterserctionArea));
        bw.flush();
        bw.close();
    }
}