import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        // TODO 1. 시작 일자와 종료 일자를 받는다
        Date startDate = new Date(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        Date endDate = new Date(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        // TODO 2. 결론은 1월 1일 기준으로 몇 일이 지났는지 각 시작일과 종료일의 일수를 비교후 뺀다.
        bw.write(String.valueOf(endDate.getTotalDayCount() - startDate.getTotalDayCount() + 1));
        bw.flush();
        bw.close();

    }
}


class Date {
    private static final int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int month;
    private final int day;

    public Date(int month, int day){
        this.month = month;
        this.day = day;
    }

    /**
    * 각 월을 순회하며 1월 1일부터 현재 Date까지의 일수를 센다.
    */
    public int getTotalDayCount(){
        int daysCount = 0;
        for (int i = 0; i < this.month; i ++){
            daysCount += days[i];
        }
        daysCount += day;

        return daysCount;
    }
}