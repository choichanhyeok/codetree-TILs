import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    private static final int OFFSET = 100;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[] line = new int[MAX_R];

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
        bw.write(String.valueOf(getCountMovedTwice()-1));
        bw.flush();
        bw.close();
    }

    private static void move(int distance, char direction){
        if (direction == 'L'){
            while (--distance != -1){
                line[OFFSET + distance] ++;
            }
        } else if (direction == 'R'){
            while (--distance != -1){
                line[OFFSET - distance] ++;
            }
        }
    }

    private static int getCountMovedTwice(){
        int answer = 0;
        for (int i = 0; i < MAX_R; i ++){
            if(line[i] > 1)
                answer ++;
        }
        return answer;
    }
}