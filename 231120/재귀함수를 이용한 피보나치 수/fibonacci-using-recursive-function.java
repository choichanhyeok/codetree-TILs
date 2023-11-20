import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    private static int recursive_fabo(int n){
        if(n == 1 || n == 2){
            return 1;
        }

        return recursive_fabo(n-1) + recursive_fabo(n-2);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        bw.write(String.valueOf(recursive_fabo(n)));
        bw.flush();
        bw.close();
    }
}