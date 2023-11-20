import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    private static int recursivePrint(int n){
        if (n == 1 || n == 2){
            return n;
        }

        return n + recursivePrint(n-2);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        bw.write(String.valueOf(recursivePrint(n)));
        bw.flush();
        bw.close();
    }
}