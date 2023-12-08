import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static final int OFFSET = 100;
    private static final int MAX_N = OFFSET * 2 + 1;
    private static final int[][] matrix = new int[MAX_N][MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j < x2; j ++){
                for (int k = y1; k < y2; k ++){
                    matrix[j][k] ++;
                }
            }
        }
        br.close();

        bw.write(String.valueOf(getSquareArea()));
        bw.flush();
        bw.close();
    }

    private static int getSquareArea(){
        int area = 0;
        for (int i = 0; i < MAX_N; i ++){
            for (int j = 0; j < MAX_N; j ++){
                if (matrix[i][j] > 0){
                    area ++;
                }
            }
        }
        return area;
    }
}