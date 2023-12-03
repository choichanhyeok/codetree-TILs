import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();

        int num = 0;
        for(int i = 0; i < binary.length(); i++)
            num = num * 2 + (binary.charAt(i) - '0');
        
        System.out.print(num);
    }
}