import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    private static void recursivePrint(int n){
        if (n == 0){
            return;
        }

        System.out.print(n + " ");
        recursivePrint(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        recursivePrint(n);

        br.close();
    }
}