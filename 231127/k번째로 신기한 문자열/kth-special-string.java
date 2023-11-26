import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();

        List<String> words = new ArrayList<String>();
        for (int i = 0; i < n; i ++){
            String nowWord = br.readLine();
            if (nowWord.startsWith(t)){
                words.add(nowWord);
            }
        } 
        br.close();

        Collections.sort(words);

        bw.write(words.get(k-1));


        bw.flush();
        bw.close();
    }
}