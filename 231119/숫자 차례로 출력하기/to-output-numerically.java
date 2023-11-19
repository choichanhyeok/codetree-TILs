import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    private static void recursivePrintASC(int x, int n){
        if (x == n){
            System.out.print(x + " ");
            return;
        }

        System.out.print(x + " ");
        recursivePrintASC(x+1, n);
    }

    private static void recursivePrintDESC(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        recursivePrintDESC(n-1);
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        recursivePrintASC(1, n);
        System.out.println();
        recursivePrintDESC(n);

        br.close();
    }
}