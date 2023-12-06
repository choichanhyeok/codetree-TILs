import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static final int OFFSET = 100;
    private static final int MAX_N = OFFSET * 2 + 1;
    private static final int[] line = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j <= end; j ++){
                line[j] ++;
            }
        }
        br.close();
        bw.write(String.valueOf(getMaxOverlappingPartCount()));
        bw.flush();
        bw.close();
    }

    private static int getMaxOverlappingPartCount(){
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < MAX_N; i ++){
            maxValue = Math.max(maxValue, line[i]);
        }

        return maxValue;
    }
}