import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


public class Main{
    private static int recursiveSum(int n){
        if (n == 1){
            return 1;
        }

        return n + recursiveSum(n-1);
    }

    public static void main(String[] hyeok) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(recursiveSum(n)));
        bw.flush();
        br.close();
        bw.close();
    }
}