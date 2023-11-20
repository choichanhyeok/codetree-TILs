import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    private static int MAX_VALUE = Integer.MIN_VALUE;
    private static final int MAX_R = 100;
    private static final int[] numbers = new int[MAX_R];

    private static void recursiveGetMaxValue(int n){
        if (n == 0){
            MAX_VALUE = numbers[0];
            return;
        }

        recursiveGetMaxValue(n-1);
        MAX_VALUE = (numbers[n] > MAX_VALUE)? numbers[n]: MAX_VALUE;
        return;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < n; i ++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        recursiveGetMaxValue(n);
        bw.write(String.valueOf(MAX_VALUE));
        bw.flush();
        bw.close();
    }
}