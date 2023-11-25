import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i ++){
            numbers[i] = Integer.parseInt(st.nextToken()); 
        }

        Arrays.sort(numbers);
        for (int number: numbers){
            bw.write(number + " ");
        }
        bw.write("\n");


        List<Integer> numbersInteger = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        Collections.sort(numbersInteger, Collections.reverseOrder());
        for (Integer number: numbersInteger){
            bw.write(number + " ");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}