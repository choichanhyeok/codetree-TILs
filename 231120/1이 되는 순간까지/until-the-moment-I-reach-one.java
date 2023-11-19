import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main{
    private static int recursiveDivideCount(int n){
        if (n == 1){
            return 0;
        }

        if (n % 2 == 0){
            return 1 + recursiveDivideCount(n / 2);
        } else{
            return 1 + recursiveDivideCount(n / 3);
        }        
    }

    public static void main(String[] hyeok) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(recursiveDivideCount(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}





















// import java.util.Scanner;

// public class Main {
//     private static int func(int n){
//         if (n == 1){
//             return 0;
//         }

//         if (n % 2 == 0){
//             n /= 2;
//         }else{
//             n /= 3;
//         }

//         return 1 + func(n); 
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(func(n));
//     }
// }