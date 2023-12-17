import java.util.Scanner;

// 문제 분석
// 1. N명의 개발자가 존재. 
// 2. T번에 걸쳐 t초에 x, y 개발자가 악수를 나눔
// 3. 1명의 개발자가 처음에 이 전염병을 옮기기 시작했다고 할 때
// 4. 감영된 이후에 K번의 악수 동안만 병을 전파한다는 조건 하에서 (단, 전염병에 걸린 상태는 해제되지 않음)
// 5. 개발자들의 악수 기록과 처음 전염된 개발자의 번호가 주어질 때,
// 6. 모든 악수를 진행한 이후에 최종적으로 전염병에 걸린 사람을 알아내라.

public class Main {
    // 필요 변수
    

    private setHandShakeHistory(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. N, K, P, T를 입력받는다
        int N = sc.nextInt();  // 개발자의 명수 N
        int K = sc.nextInt();  // 감염 기간 K
        int P = sc.nextInt();  // 최초 전염 개발자
        int T = sc.nextInt();  // 개발자가 악수를 나눈 횟수


        // TODO 2. T번에 걸쳐 악수를 나눈것에 대한 정보가 주어진다.
        int t = sc.nextInt();  // 악수를 나눈 시간
        int x = sc.nextInt();  // 악수자1 id
        int y = sc.nextInt();  // 악수자2 id

        // TODO 3. 최초 감염자부터 시작해 감영자 파악 리스트 생성 후, 감영 유효 여부도 체크?
        


        // TODO 4. 1 ~ N의 번호의 개발자들의 감염 여부를 표시

    }
}


// 제시 풀이
// 1. 각 사람이 악수한 시간과 두 사람의 번호를 클래스 배열에 저장하라 (클래스 배열?)
// 2. 악수 시간 오름차순 기준으로 정렬
// 4. 각 시간별로 악수한 사람들이 감염 되었는지 검토
// 5. 각 사람의 전염 가능 횟수가 유효하면, 상대방 전염