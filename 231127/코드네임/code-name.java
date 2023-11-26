import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Agent> agents = new ArrayList<Agent>();
        String mostBadAgentCode = "";
        int minimumScore = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String codeName = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            
            agents.add(new Agent(codeName, score));

            if (score < minimumScore){
                mostBadAgentCode = codeName;
                minimumScore = score;
            }
        }
        br.close();

        for (Agent agent: agents){
            if(agent.isMe(mostBadAgentCode)){
                bw.write(agent.about());
            }
        }

        bw.flush();
        bw.close();
    }
}


class Agent{
    private final String codeName;
    private final int score;

    public Agent(String codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }

    public boolean isMe(String name){
        return (this.codeName == name);
    }

    public String about(){
        return this.codeName + " " + this.score;
    }
}