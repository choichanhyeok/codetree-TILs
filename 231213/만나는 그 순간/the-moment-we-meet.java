import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX_R = 1000000;
    private static final int[] lineA = new int[MAX_R];
    private static final int[] lineB = new int[MAX_R];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // TODO 1. 각 A, B가 매 초마다 어느 위치에 있는지 기록
        int currentA = 0;
        int aSize = 0;
        for (int i = 0; i < n; i ++){
            st = new StringTokenizer(br.readLine());
            char direction = st.nextToken().charAt(0);
            int distance = Integer.parseInt(st.nextToken());

            while (distance-- != 0){    
                currentA += (direction == 'R')? 1: -1;
                lineA[i] = currentA;
                aSize ++;
            }
        }

        int currentB = 0;
        int bSize = 0;
        for (int i = 0; i < m; i ++){
            st = new StringTokenizer(br.readLine());
            char direction = st.nextToken().charAt(0);
            int distance = Integer.parseInt(st.nextToken());

            while (distance-- != 0){
                currentB += (direction == 'R')? 1: -1;
                lineB[i] = currentB;
                bSize ++;
            }
        }
        br.close();

        // TODO 2. A와 B가 만나는 시간 추력
        int meetCount = 0;
        boolean isMeet = false;
        for (int i = 0; i < Math.min(aSize, bSize); i ++){;
            meetCount ++;
            if(lineA[i] == lineB[i]){
                bw.write(String.valueOf(meetCount));
                isMeet = true;
            }
        }
        System.out.println(meetCount);
        if (!isMeet)
            bw.write("-1");

        bw.flush();
        bw.close();
    }
}