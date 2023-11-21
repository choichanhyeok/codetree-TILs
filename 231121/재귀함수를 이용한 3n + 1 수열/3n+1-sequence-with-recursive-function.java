import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    private static int getProcessCount(int n){
        if (n == 1){
            return 0;
        }

        if (n % 2 == 0){
            return getProcessCount(n/2) + 1;
        }else{
            return getProcessCount(n*3+1) + 1;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        String answer = String.valueOf(getProcessCount(n));

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}