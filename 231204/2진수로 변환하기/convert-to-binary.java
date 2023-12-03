import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        // TODO 1. 십진수 n 입력
        int decimal = Integer.parseInt(br.readLine());
        br.close();

        // TODO 2. 2진수로 변환
        convertDecimalToBinary(decimal);

        // TODO 3. flush
        bw.flush();
        bw.close();

    }

    private static void convertDecimalToBinary(int decimal) throws IOException{
        int[] digit = new int[100];
        int digitSize = 0;

        while(true){
            if (decimal < 2){
                digit[digitSize] = 1;
                break;
            }

            digit[digitSize] = decimal % 2;
            digitSize ++;
            decimal /= 2;
        }

        for (int i = digitSize; i >= 0; i --){
            bw.write(String.valueOf(digit[i]));
        }
    }
}