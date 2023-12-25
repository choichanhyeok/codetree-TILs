import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            persons[i] = new Person(name, kor, eng, math);
        }
        br.close();
        Arrays.sort(persons);

        for (Person p: persons){
            bw.write(p.about() + "\n");
        }
        bw.flush();
        bw.close();
    }
}


class Person implements Comparable<Person>{
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Person(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Person student){
        if(this.kor != student.kor)
            return student.kor - this.kor;
        if(this.eng != student.eng)
            return student.eng - this.eng;
        return student.math - this.math;
    }

    public String about(){
        return this.name + " " + this.kor + " " + this.eng + " " + this.math;
    }
}