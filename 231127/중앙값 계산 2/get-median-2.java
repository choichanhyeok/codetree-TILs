import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        // TODO 1. 홀수번째 입력에서 정렬후 [현재 idx / 2 + 1] 위치의 값 write
        int[] numbers = new int[n];
        for (int i = 1; i <= n; i ++){
            numbers[i-1] = Integer.parseInt(st.nextToken());
            if (i % 2 != 0){
                Arrays.sort(numbers, 0, i);
                bw.write(numbers[(i/2)] + " ");
            }
        }
        bw.flush();
        bw.close();

    }
}