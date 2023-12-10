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

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // TODO 1. x, y 로부터 거리가 8인 사각형 그리기
            drawSquare(x, y);
        }
        br.close();

        // TODO 2. 색이 칠해진 area 구하기
        bw.write(String.valueOf(getArea()));
        bw.flush();
        bw.close();
    }

    private static void drawSquare(int x, int y){
        for (int i = x; i < x + 8; i ++){
            for (int j = y; j < y + 8; j ++){
                matrix[i][j] = 1;
            }
        }
    }

    private static int getArea(){
        int area = 0;
        
        for (int i = 0; i < MAX_R; i ++){
            for (int j = 0; j < MAX_R; j ++){
                if (matrix[i][j] == 1){
                    area ++;
                }
            }
        }

        return area;
    }
}