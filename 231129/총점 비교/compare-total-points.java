import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];
        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            students[i] = new Student(name, kor, eng, math);
        }
        br.close();
        Arrays.sort(students);

        for (Student student: students){
            bw.write(student.about() + "\n");
        }

        bw.flush();
        bw.close();
    }
}


class Student implements Comparable<Student> {

    private final String name;
    private final int kor, eng, math;

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student other){
        return (this.kor + this.eng + this.math) - (other.kor + other.eng + other.math);
    }

    public String about(){
        return this.name + " " + this.kor + " " + this.eng + " " + this.math;
    }
}