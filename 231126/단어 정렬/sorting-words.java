import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<String> values = new ArrayList<String>();

        for (int i = 0; i < n; i ++){
            values.add(br.readLine());
        }
        
        Collections.sort(values);

        for (String value: values){
            bw.write(value + "\n");
        }

        bw.flush();
        bw.close();
    }
}