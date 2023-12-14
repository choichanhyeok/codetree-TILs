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

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] lineA = new int[1000000];
        int[] lineB = new int[1000000];
        int posA = 1;
        int posB = 1;
        for (int i = 0; i < n; i ++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while(t-- > 0){
                lineA[posA] = lineA[posA-1] + v; 
                posA ++;
            }
        }

        for (int i = 0; i < m; i ++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while(t-- > 0){
                lineB[posB] = lineB[posB-1] + v;
                posB ++;
            }
        }

        int overCount = 0;
        boolean isLeadA = (lineA[1] > lineB[1])? true: false;

        for (int i = 2; i < posA; i ++){
            if(isLeadA){
                if(lineA[i] < lineB[i]){
                    isLeadA = false;
                    overCount ++;
                }
            }else {
                if(lineA[i] > lineB[i]) {
                    isLeadA = true;
                    overCount ++;
                }   
            }
        }
        br.close();
        bw.write(String.valueOf(overCount));
        bw.flush();
        bw.close();
        
    }
}