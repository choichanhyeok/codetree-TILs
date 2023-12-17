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

        int n = Integer.parseInt(br.readLine());

        int currentX = 0;
        int currentY = 0;
        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char direction = st.nextToken().charAt(0);
            int distance = Integer.parseInt(st.nextToken());

            if (direction == 'W')
                currentX -= distance;
            else if (direction == 'E')
                currentX += distance;
            else if (direction == 'N')
                currentY += distance;
            else if (direction == 'S')
                currentY -= distance;
        }
        br.close();

        bw.write(currentX + " " + currentY);
        bw.flush();
        bw.close();

    }
}