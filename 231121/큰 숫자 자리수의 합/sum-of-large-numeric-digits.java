import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static int recursiveSumEachDigit(int value){
        if (value < 10){
            return value;
        }

        return recursiveSumEachDigit(value / 10) + (value % 10);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int multipleValue = 1;

        for (int i = 0; i < 3; i ++){
            multipleValue *= Integer.parseInt(st.nextToken());    
        }

        String answer = String.valueOf(recursiveSumEachDigit(multipleValue));

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}