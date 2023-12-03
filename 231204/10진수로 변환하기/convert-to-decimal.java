import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] binary = new int[]{1, 1, 1, 0, 1};
        int num = 0;

        for (int i = 0; i < 5; i ++){
            num = num * 2 + binary[i]; // 걍 공식임
        }
        
        System.out.print(num);
    }
}