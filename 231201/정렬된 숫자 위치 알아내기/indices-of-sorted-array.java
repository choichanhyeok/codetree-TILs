import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // TODO 0. Number 클래스 배열의 값을 받는다
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        Number[] numbers = new Number[n];

        for (int i = 0; i < n; i ++){
            numbers[i] = new Number(i+1, Integer.parseInt(st.nextToken()));
        }
        br.close();

        // TODO 1. 정렬 후
        Arrays.sort(numbers);


        // TODO 2. 정렬된 각 번지의 요소 값을 인덱스로 해서 i값으로 값을 채워넣기
        int[] result = new int[n];

        for (int i = 0; i < n; i ++){
            result[numbers[i].idx-1] = i;
        }
        for (int i = 0; i < n; i ++){
            bw.write(String.valueOf(result[i]+1) + " ");
        }

        bw.flush();
        bw.close();
    }
}



class Number implements Comparable<Number>{
    final int idx;
    final int number;

    public Number(int idx, int number){
        this.idx = idx;
        this.number = number;
    }

    @Override
    public int compareTo(Number other){
        return this.number - other.number;
    }
}