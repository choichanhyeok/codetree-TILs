import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i ++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);
        for (int i = 0; i < n; i ++){
            bw.write(numbers[i]+ " ");
        }
        bw.write("\n");

        Integer[] numbersInteger = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(numbersInteger, Collections.reverseOrder());

        for (int i = 0 ; i < n; i ++){
            bw.write(numbersInteger[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}