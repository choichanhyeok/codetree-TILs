import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int count = 0;
        int MAX_COUNT = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            int nowNumb = Integer.parseInt(st.nextToken());
            if (i == 0 || nowNumb <= t){
                MAX_COUNT = Math.max(MAX_COUNT, count);
                count = 0;
            }
            count ++;
        }
        MAX_COUNT = Math.max(MAX_COUNT, count);

        br.close();

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}