import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static final int OFFSET = 100;
    private static final int MAX_N = OFFSET * 2 + 1;
    private static final int[] line = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int distance = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);
            move(distance, direction);
        }

        br.close();
        bw.write(String.valueOf(getBetterThanTwoCount()));
        bw.flush();
        bw.close();
    }

    private static int getBetterThanTwoCount(){
        int count = 0;

        for (int i = 0; i < MAX_N; i ++){
            if (line[i] > 1){
                count ++;
            }
        }
        return count;
    }

    private static void move(int distance, char direction){
        if (direction == 'R'){
            while (distance-- != 1)
                line[OFFSET+distance] ++;
            
        } else{
            while (distance-- != 1)
                line[OFFSET-distance] ++;
        }
    }
}