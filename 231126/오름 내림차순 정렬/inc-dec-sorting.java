import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < n; i ++){
            numbers.add(Integer.parseInt(st.nextToken()));    
        }

        Collections.sort(numbers);
        for (Integer number: numbers){
            bw.write(number + " ");
        }
        bw.write("\n");

        Collections.sort(numbers, Collections.reverseOrder());
        for (Integer number: numbers){
            bw.write(number + " ");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}