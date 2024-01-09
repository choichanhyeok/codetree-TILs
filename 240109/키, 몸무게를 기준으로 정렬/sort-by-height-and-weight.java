import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        Student[] students = new Student[n];

        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            students[i] = new Student(name, height, weight);
        }
        br.close();

        Arrays.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student student, Student other){
                if (student.isNotSameHeight(other))
                    return student.compareHeight(other);
                else
                    return student.compareWeight(other);
            }
        });

        for (Student student: students){
            bw.write(student.introduceMySelf() + "\n");
        }
        bw.flush();
        bw.close();
    }
}


class Student{
    private String name;
    private int height;
    private int weight;
    
    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String introduceMySelf(){
        return this.name + " " + this.height + " " + this.weight;
    }

    public int compareHeight(Student other){
        return this.height - other.height;
    }

    public int compareWeight(Student other){
        return other.weight - this.weight;
    }

    public boolean isNotSameHeight(Student other){
        return this.height != other.height;
    }
}