import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static final int[] dys = new int[]{1, 0, -1, 0};
    private static final int[] dxs = new int[]{0, 1, 0, -1};
    private static int x, y;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String commands = br.readLine();
        br.close();

        move(commands);
        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }

    private static void move(String commands){
        int currentDirection = 0;

        for (char command: commands.toCharArray()){
            if (command == 'R')
                currentDirection = (currentDirection + 1) % 4;
            else if (command == 'L')
                currentDirection = (currentDirection - 1 + 4) % 4;
            else if (command == 'F'){
                x += dxs[currentDirection];
                y += dys[currentDirection];
            }
        }
    }
}