import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void recursivePrintStartByAsc(int x, int n){
        for (int i = 1; i <= x; i++){
            System.out.print("*");
        }
        System.out.println();

        if (x == n){
            return;
        }{
            recursivePrintStartByAsc(x+1, n);
        }
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        recursivePrintStartByAsc(1, n);
    }
}