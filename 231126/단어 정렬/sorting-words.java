import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] values = new String[n];

        for (int i = 0; i < n; i ++){
            values[i] = br.readLine();
        }
        br.close();

        Arrays.sort(values);

        for (String value: values){
            bw.write(value + "\n");
        }

        bw.flush();
        bw.close();
    }
}