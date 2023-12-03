import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] hyeok) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        Date startDate = new Date(11, 11, 11);
        Date endDate = new Date(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        bw.write(String.valueOf(endDate.getDaysSinceNewYear() - startDate.getDaysSinceNewYear()));
        bw.flush();
        bw.close();
    }
}


class Date{
    private final int day;
    private final int hour;
    private final int minute;

    public Date(int day, int hour, int minute){
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public int getDaysSinceNewYear(){
        int totalMinute = (day * 24 * 60) + (hour * 60) + minute;

        return totalMinute;
    }
}