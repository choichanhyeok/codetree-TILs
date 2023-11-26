import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static boolean isSameSequence(List<Integer> numbersA, List<Integer> numbersB, int n){
        for (int i = 0; i < n; i ++){
            if (numbersA.get(i) != numbersB.get(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> numbersA = new ArrayList<Integer>();
        List<Integer> numbersB = new ArrayList<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i ++){
            numbersA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i ++){
            numbersB.add(Integer.parseInt(st.nextToken()));
        }
        br.close();

        Collections.sort(numbersA);
        Collections.sort(numbersB);

        if (isSameSequence(numbersA, numbersB, n)){
            bw.write("Yes");
        } else{
            bw.write("No");
        }
        bw.flush();
        bw.close();
    }
}