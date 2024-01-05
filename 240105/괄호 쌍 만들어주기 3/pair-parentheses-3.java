import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] sequence = br.readLine().toCharArray();
        br.close();
        // TODO 1. i 번째 시작 괄호'(' 다음에 (i+1) 번째부터 j로 순회해서 ')'의 개수 찾기 
        int answer = 0;
        int n = sequence.length;
        for (int i = 0; i < n; i ++){
            for (int j = i + 1; j < n; j ++){
                if (sequence[i] == '(' && sequence[j] == ')'){
                    answer ++;
                }
            }
        }
        
        // TODO 2. 
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}