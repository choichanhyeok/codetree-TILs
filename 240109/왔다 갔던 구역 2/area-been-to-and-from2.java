import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static final int OFFSET = 1000;
    private static final int MAX_N = OFFSET * 2 + 1;
    private static final int[] line = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] leftHistory = new int[n];
        int[] rightHistory = new int[n];

        int currentIndex = OFFSET;
        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int distance = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);

            if (direction == 'R'){
                leftHistory[i] = currentIndex;
                rightHistory[i] = currentIndex + distance;
                currentIndex += distance;
            }else if (direction == 'L'){
                leftHistory[i] = currentIndex - distance;
                rightHistory[i] = currentIndex;
                currentIndex -= distance;
            }
        }

        for (int i = 0; i < n; i ++){
            for (int j = leftHistory[i]; j < rightHistory[i]; j ++){
                line[j] ++;
            }
        }

        br.close();
        bw.write(String.valueOf(getBetterThanTwoCount()));
        bw.flush();
        bw.close();
    }

    private static int getBetterThanTwoCount(){
        int count = 0;
        for (int i = 0; i < MAX_N; i ++){
            if (line[i] > 1)
                count ++;
        }

        return count;
    }

}