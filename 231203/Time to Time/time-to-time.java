import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int currentHour = Integer.parseInt(st.nextToken());
        int currentMinute = Integer.parseInt(st.nextToken());
        int endHour = Integer.parseInt(st.nextToken());
        int endMinute = Integer.parseInt(st.nextToken());
        int elapsedTime = 0;

        while(true){
            if (currentHour == endHour && currentMinute == endMinute){
                break;
            }
            elapsedTime ++;
            currentMinute ++;

            if (currentMinute == 60){
                currentHour ++;
                currentMinute = 0;
            }
        }

        bw.write(String.valueOf(elapsedTime));
        bw.flush();
        bw.close();
    }
}