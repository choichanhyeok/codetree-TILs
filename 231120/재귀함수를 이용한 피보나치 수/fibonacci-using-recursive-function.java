import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    private static int recursiveFabo(int n){
        if (n == 1 || n == 2){
            return 1; 
        }

        return recursiveFabo(n-1) + recursiveFabo(n-2);
    }


    public static void main(String[] hyeok)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(recursiveFabo(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}





































// import java.util.Scanner;

// public class Main {
//     private static int fabo(int n){
//        if (n <= 2){
//         return 1;
//        } 

//        return fabo(n-1) + fabo(n-2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         System.out.println(fabo(n));
//     }
// }