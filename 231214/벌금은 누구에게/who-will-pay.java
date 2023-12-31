import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] students = new int[n+1];
        int answer = -1;
        for (int i = 0; i < m; i ++){
            int currentIdx = Integer.parseInt(br.readLine());
            students[currentIdx] ++;

            if (students[currentIdx] >= k){
                answer = currentIdx;
                break;
            }
        }
        br.close();
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}