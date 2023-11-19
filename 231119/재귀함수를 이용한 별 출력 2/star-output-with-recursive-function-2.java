import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    private static void recursivePrintStart(int n){
        if (n == 0){
            return;
        }

        for (int i = 0; i < n; i ++){
            System.out.print("* ");
        }
        System.out.println();
        recursivePrintStart(n-1);

        for (int i = 0; i < n; i ++){
            System.out.print("* ");
        }
        System.out.println();
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        recursivePrintStart(n);

        br.close();
    }
}