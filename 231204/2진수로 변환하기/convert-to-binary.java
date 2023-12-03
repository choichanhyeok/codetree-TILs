import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] answer = new int[20];
        int cnt = 0;
        while(true){
            // TODO 1. 만약 나눈 결과가 1이 되면 현재 n 값 그대로를 넣고 반복문 종료
            if (n < 2){
                answer[cnt++] = n;
                break;
            }
            // TODO 2. 나눈 결과가 1이 아니라면 n을 2로 나눈 나머지를 digits에 추가하고 n은 2로 나누어줌
            answer[cnt ++] = n%2;
            n /= 2;
        }

        for (int i = cnt-1; i >= 0; i --){
            System.out.print(answer[i]);
        }
    }
}