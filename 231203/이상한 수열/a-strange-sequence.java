import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());        
        br.close();
        int result = recursiveGetStrange(n);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static int recursiveGetStrange(int n){
        if (n == 1){
            return 1;
        } else if(n == 2){
            return 2;
        }

        return recursiveGetStrange(n/3) + recursiveGetStrange(n-1);
    }
}