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

        int n = Integer.parseInt(br.readLine().trim());

        Student[] students = new Student[n];
        for (int i = 0;  i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            students[i] = new Student(height, weight, i + 1);
        }
        br.close();
        Arrays.sort(students);

        for (Student student: students){
            bw.write(student.height + " " + student.weight + " " + student.idx + "\n");
        }

        bw.flush();
        bw.close();
    }
}


class Student implements Comparable<Student>{
    final int height;
    final int weight;
    final int idx;

    public Student(int height, int weight, int idx){
        this.height = height;
        this.weight = weight;
        this.idx = idx;
    }

    @Override
    public int compareTo(Student other){
        if (this.height != other.height)
            return this.height - other.height;
        
        return other.weight - this.weight;
    }
}