import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX_SIZE = 100;
    private static int[] numbers = new int[MAX_SIZE];
    private static int MAX_VALUE = 0;


    private static void recursiveFindMaxValue(int n){
        if (n == 0){
            return;
        }

        MAX_VALUE = Math.max(MAX_VALUE, numbers[n-1]);

        recursiveFindMaxValue(n-1);
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

        recursiveFindMaxValue(n);

        bw.write(String.valueOf(MAX_VALUE));
        bw.flush();
        bw.close();
    }
}