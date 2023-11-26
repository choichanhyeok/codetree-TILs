import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static boolean isSame(char[] a, char[] b){

        if (a.length != b.lenth)
            return false;

        for (int i = 0; i < a.length; i ++){
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        br.close();

        Arrays.sort(a);
        Arrays.sort(b);

        if(isSame(a, b)){
            bw.write("Yes");
        }else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
    }
}