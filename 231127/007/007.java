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

        String secretCode = st.nextToken();
        String meetingPoint = st.nextToken();
        int time = Integer.parseInt(st.nextToken());

        Agent agent = new Agent(secretCode, meetingPoint, time);
        bw.write(agent.getAbout());

        bw.flush();
        bw.close();
    }
}


class Agent{
    private final String secretCode;
    private final String meetingPoint;
    private final int time;

    public Agent(String secretCode, String meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public String getAbout(){
        String answer = "secret code : " + this.secretCode + "\nmeeting point : " + this.meetingPoint + "\ntime : " + this.time;
        
        return answer;
    }
}