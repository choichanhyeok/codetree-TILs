import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int MAX_COUNT = Integer.MIN_VALUE;
        int[] sequence = new int[n];

        for (int i = 0; i < n; i ++){
            sequence[i] = Integer.parseInt(br.readLine());

            if (i == 0 || sequence[i] <= sequence[i-1]){
                MAX_COUNT = Math.max(MAX_COUNT, count);
                count = 0;                
            }
            count ++;
        }
        MAX_COUNT = Math.max(MAX_COUNT, count);
        br.close();

        bw.write(String.valueOf(MAX_COUNT));
        bw.flush();
        bw.close();
    }
}