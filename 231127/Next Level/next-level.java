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

        String newId = st.nextToken();
        int newLevel = Integer.parseInt(st.nextToken());
        br.close();

        User userA = new User("codetree", 10);
        User userNew = new User(newId, newLevel);

        bw.write(userA.getAbout() + "\n");
        bw.write(userNew.getAbout());

        bw.flush();
        bw.close();
    }
}


class User{
    private String id;
    private int level;

    public User(String id, int level){
        this.id = id;
        this.level = level;
    }

    public String getAbout(){
        String answer = "user " + this.id + " lv " + this.level;

        return answer;
    }
}