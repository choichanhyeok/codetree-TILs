import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    private static int recursiveWTF(int n){
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        
        return recursiveWTF(n / 3) + recursiveWTF(n - 1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        recursiveWTF(n);
    }
}