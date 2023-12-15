import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static final int OFFSET = 1000000;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[] lineA = new int[MAX_R];
    private static final int[] lineB = new int[MAX_R];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int currentA = OFFSET;
        int currentB = OFFSET;


        int lastIndexA = 0;
        for (int i = 0; i < n; i ++){
            st = new StringTokenizer(br.readLine());
            int distance = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);

            while(distance-- != 0){
                currentA += (direction == 'R'? 1: -1);
                lineA[lastIndexA] = currentA;
                lastIndexA ++;
            }
        }

        int lastIndexB = 0;
        for (int i = 0; i < m; i ++){
            st = new StringTokenizer(br.readLine());
            int distance = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);

            while(distance-- != 0){
                currentB += (direction == 'R'? 1: -1);
                lineB[lastIndexB] = currentB;
                lastIndexB ++;
            }
        }
        br.close();

        // TODO 0. 
        if (lastIndexA < lastIndexB){
            for (int i = lastIndexA; i < lastIndexB; i++){
                lineA[i] = lineA[lastIndexA-1];
            }
        } else if (lastIndexA > lastIndexB){
            for (int i = lastIndexB; i < lastIndexA; i ++)
                lineB[i] = lineB[lastIndexB-1];
        }


        // TODO 1. 배열 기록을 순회하며, 직전 위치에는 다르게 있다가 현재 같아지는 녀석을 카운트
        int answer = 0;
        for (int i = 1; i < Math.max(lastIndexA, lastIndexB); i ++){
            if ((lineA[i-1] != lineB[i-1]) && (lineA[i] == lineB[i]))
                answer ++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}