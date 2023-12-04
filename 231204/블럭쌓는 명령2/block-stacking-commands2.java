import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX_SIZE = 101;
    private static final int[] numbers = new int[MAX_SIZE];

    private static int getMaxCount(){
        int result = 0;

        for (int number: numbers){
            result = Math.max(result, number);
        }
        return result;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < k; i ++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j <= end; j ++){
                numbers[j] ++;
            }
        }

        br.close();

        bw.write(String.valueOf(getMaxCount()));

        bw.flush();
        bw.close();
    }
}