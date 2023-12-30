import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int passwordI = sc.nextInt();
        int passwordJ = sc.nextInt();
        int passwordK = sc.nextInt();

        int answer = 0;

        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= n; j ++){
                for (int k = 1; k <= n; k ++){
                    if (Math.abs(passwordI - i) <= 2 || Math.abs(passwordJ - j) <= 2 || Math.abs(passwordK - k) <= 2){
                        answer ++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}