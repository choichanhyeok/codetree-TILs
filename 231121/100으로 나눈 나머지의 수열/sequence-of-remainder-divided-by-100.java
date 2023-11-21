import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    private static int getMutipleValueAsCountN(int n){
        if (n == 1)
            return 2;
        else if (n == 2)
            return 4;
        
        return (getMutipleValueAsCountN(n-1) * getMutipleValueAsCountN(n-2)) % 100;
    } 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        String answer = String.valueOf(getMutipleValueAsCountN(n));

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}