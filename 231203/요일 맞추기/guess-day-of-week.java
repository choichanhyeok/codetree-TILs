import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Date startDate = new Date(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        Date endDate = new Date(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        int daysDifference = endDate.getDaysSinceNewYear() - startDate.getDaysSinceNewYear();

        while(daysDifference < 0)
            daysDifference += 7;

        bw.write(startDate.getDayOfWeekAfter(daysDifference));
        bw.flush();
        bw.close();
    }
}

class Date{
    private final int month;
    private final int day;
    private static final int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public Date(int month, int day){
        this.month = month;
        this.day = day;
    }

    public int getDaysSinceNewYear(){
        int totalDate = 0;
        for (int i = 1; i < this.month; i ++)
            totalDate += days[i];
        totalDate += this.day;

        return totalDate;
    }

    public String getDayOfWeekAfter(int daysAfter){
        return daysOfWeek[daysAfter%7];
    }
}