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

        int count = 1;
        int MAX_COUNT = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            int nowNumb = Integer.parseInt(st.nextToken());
            count ++;
            if (i == 0 || nowNumb <= t){
                MAX_COUNT = Math.max(MAX_COUNT, nowNumb);
                count = 1;
            }
        }

        br.close();

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}