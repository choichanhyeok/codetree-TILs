import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static final int OFSSET = 1000;
    private static final int MAX_R = OFSSET * 2 + 1;
    private static final int[][] matrix = new int[MAX_R][MAX_R];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + OFSSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFSSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFSSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFSSET;

            fetchSquare(x1, x2, y1, y2, (i+1));
        }
        br.close();
        bw.write(String.valueOf(getArea()));
        bw.flush();
        bw.close();
    }

    private static void fetchSquare(int x1, int x2, int y1, int y2, int mark){
        for (int i = x1; i < x2; i ++){
            for (int j = y1; j < y2; j ++){
                matrix[i][j] = mark;
            }
        }
    }

    private static int getArea(){
        int area = 0;
        for (int i = 0; i < MAX_R; i ++){
            for (int j  = 0; j < MAX_R; j ++){
                int currentMark = matrix[i][j];
                if (currentMark == 1 || currentMark == 2){
                    area ++;
                }
            }
        }
        
        return area;
    }
}