import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();
        int result = recursiveDivide(n);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static int recursiveDivide(int n){
        if (n == 1){
            return 2;
        } else if (n == 2){
            return 4;
        }

        return (recursiveDivide(n-1) * recursiveDivide(n-2)) % 100;
    }
}