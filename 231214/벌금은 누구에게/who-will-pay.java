import java.util.Scanner;

// 문제 분석
// 1. n명의 학생 번호 존재, 그 중 m명의 벌칙 걸린 학생이 있는데 벌칙 횟수가 k회가 되면 벌금을 내야한다.
// 2. 인풋은 n(학생 번호의 수), m(벌칙 걸린 학생 수), k(벌금의 기준이 되는 횟수)
// 3. m번에 걸쳐 벌칙 걸린 학생 정보가 주어지면 k회 이상 걸린 최초의 사람을 출력한다.

public class Main {
    // 필요 변수
    private static final int MAX_R = 100000 + 1;
    private static final int[] studentPenaltys = new int[MAX_R];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO 1. n, m, k를 입력받는다
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        // TODO 2. m번에 걸쳐 학생 벌칙 정보 입력, studentPenaltys에 기록
        int answer = -1;
        for (int i = 0; i < m; i ++){
            int studentId = sc.nextInt();
            studentPenaltys[studentId] += 1;
            // TODO 3. 만약 학생의 벌칙 횟수가 k회가 넘으면 학생의 id를 출력, 없으면 -1
            if (studentPenaltys[studentId] == k){
                answer = studentId;
                break;
            }
        }

        System.out.println(answer);
    }
}