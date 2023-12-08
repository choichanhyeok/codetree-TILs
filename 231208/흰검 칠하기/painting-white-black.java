import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static final int OFFSET = 100000;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[] line = new int[MAX_R];
    private static final int[] cntBlack = new int[MAX_R];
    private static final int[] cntWhite = new int[MAX_R];
    private static int b, w, g;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int currentIndex = OFFSET;
        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int distance = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);

            if (direction == 'L'){
                while(distance-- > 0){
                    line[currentIndex] = 1;
                    cntWhite[currentIndex] ++;  
                    if(distance > 0) currentIndex --;
                }
            }
            else if (direction == 'R'){
                while(distance-- > 0){
                    line[currentIndex] = 2;
                    cntBlack[currentIndex] ++;
                    if(distance > 0) currentIndex ++;
                }
            }
        }
        br.close();

        for (int i = 0; i < MAX_R; i++){
            if (cntBlack[i] >= 2 && cntWhite[i] >= 2){
                g ++;
            }
            else if (line[i] == 1){
                w ++;
            } else if (line[i] == 2){
                b ++;
            }
        }
        bw.write(w + " " + b + " " + g);
        bw.flush();
        bw.close();
    }
}