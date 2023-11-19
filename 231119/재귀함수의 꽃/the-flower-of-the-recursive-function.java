import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    private static void recursivePrintDesc(int x){
        if (x == 1){
            System.out.print(x + " ");
            return;
        }

        System.out.print(x + " ");
        recursivePrintDesc(x-1);
    }

    private static void recursivePrintAsc(int x, int n){
        if (n == x){
            System.out.print(x + " ");
            return;
        }

        System.out.print(x +  " ");
        recursivePrintAsc(x+1, n);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        recursivePrintDesc(n);
        recursivePrintAsc(1, n);

        br.close();
    }
}