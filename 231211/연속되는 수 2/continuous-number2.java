import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static final int MAX_N = 1000;
    private static final int[] numbers = new int[MAX_N];
    private static int MAX_VALUE = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n  = Integer.parseInt(br.readLine());
        int seq = 0;
        for (int i = 0; i < n; i ++){
            numbers[i] = Integer.parseInt(br.readLine());

            if (i == 0 || numbers[i-1] != numbers[i]){
                MAX_VALUE = (MAX_VALUE < seq)? seq: MAX_VALUE;
                seq = 0;
            }
            seq ++;
        }
        MAX_VALUE = (MAX_VALUE < seq)? seq: MAX_VALUE;

        br.close();
        bw.write(String.valueOf(MAX_VALUE));
        bw.flush();
        bw.close();
    }
}