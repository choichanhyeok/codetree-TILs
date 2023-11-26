import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        String code = st.nextToken();
        String targetLineColor = st.nextToken();
        int targetSecond = Integer.parseInt(st.nextToken());

        Bomb bomb = new Bomb(code, targetLineColor, targetSecond);
        bw.write(bomb.about());

        bw.flush();
        bw.close();
    }
}


class Bomb{
    String code;
    String targetLineColor;
    int targetSecond;

    public Bomb(String code, String targetLineColor, int targetSecond){
        this.code = code;
        this.targetLineColor = targetLineColor;
        this.targetSecond = targetSecond;
    }

    public String about(){
        return "code : " + this.code + "\ncolor : " + this.targetLineColor + "\nsecond : " + this.targetSecond;
    }
}