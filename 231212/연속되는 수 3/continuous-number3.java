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
        int[] numbers = new int[n];
        int maxCount = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i ++){
            numbers[i] = Integer.parseInt(br.readLine());
            if (i == 0 || (numbers[i] * numbers[i-1]) < 0){
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
            count ++;
        }

        br.close();
        maxCount = Math.max(maxCount, count);

        bw.write(String.valueOf(maxCount));
        bw.flush();
        bw.close();
    }
}