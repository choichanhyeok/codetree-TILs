import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;


public class Main {
    private static int getManhatonDistance(int x, int y){
        return Math.abs(x) + Math.abs(y);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // TODO 1. 점의 개수 n 입력
        int n = Integer.parseInt(br.readLine());

        // TODO 2. 좌표값 |x1 - x2| 구해서 idx와 함께 포인터 적재
        Point[] points = new Point[n];
        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Point(getManhatonDistance(x, y), i+1);
        }
        br.close();

        // TODO 3. 객체 정렬 (거리가 작은 순부터, 거리가 같을경우 번호가 작은 순)
        Arrays.sort(points);

        // TODO 4. 출력
        for (Point point: points){
            bw.write(point.idx + "\n");
        }
        bw.flush();
        bw.close();
    }
}


class Point implements Comparable<Point>{
    final int idx;
    final int distance;

    public Point(int distance, int idx){
        this.idx = idx;
        this.distance = distance;
    }

    @Override
    public int compareTo(Point other){
        if (this.distance != other.distance)
            return this.distance - other.distance;
        
        return this.idx - other.idx;
    }
}