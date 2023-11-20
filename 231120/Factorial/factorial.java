import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    private static int recursiveFacorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }

        return recursiveFacorial(n-1) * n;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(recursiveFacorial(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}