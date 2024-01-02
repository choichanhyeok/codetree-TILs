import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static final ArrayList<Integer> numbList = new ArrayList<>();
    private static int k, n; 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    private static void printBox() throws IOException{
        for (Integer numb: numbList){
            bw.write(String.valueOf(numb) + " ");
        }
        bw.write("\n");
    }

    private static void findPermutate(int cnt) throws IOException{
        if (cnt == n){
            printBox();
            return;
        }

        for (int i = 1; i <= k; i ++){
            numbList.add(i);
            findPermutate(cnt + 1);
            numbList.remove(numbList.size()-1);
        }
    }

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        br.close();

        findPermutate(0);
        bw.flush();
        bw.close();
    }
}