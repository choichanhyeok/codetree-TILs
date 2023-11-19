import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main{
    private static int recursiveSumEachDigit(int n){
        if (n < 10){
            return n * n;
        }

        return recursiveSumEachDigit(n / 10) + ((n % 10) * (n % 10));
    }

    public static void main(String[] hyeok) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        bw.write(String.valueOf(recursiveSumEachDigit(n)));
        bw.flush();
        bw.close();
    }
}



































// import java.util.Scanner;

// public class Main {
//     public static int processRun(int n){
//         if (n <= 9){
//             return n * n;
//         }

//         int digit = n % 10;
//         return digit*digit + processRun(n/10);

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         System.out.println(processRun(n));
//     }
// }