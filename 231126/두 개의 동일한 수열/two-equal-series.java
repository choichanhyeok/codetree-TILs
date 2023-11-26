import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;


public class Main {
    private static boolean isSameSequence(int[] numbersA, int[] numbersB, int n){
        for (int i = 0; i < n; i ++){
            if (numbersA[i] != numbersB[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] numbersA = new int[n];
        int[] numbersB = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i ++){
            numbersA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i ++){
            numbersB[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(numbersA);
        Arrays.sort(numbersB);

        if (isSameSequence(numbersA, numbersB, n)){
            bw.write("Yes");
        } else{
            bw.write("No");
        }
        bw.flush();
        bw.close();
    }
}