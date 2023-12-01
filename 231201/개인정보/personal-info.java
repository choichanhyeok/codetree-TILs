import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Person[] persons = new Person[5];

        // TODO 0. persons 초기화
        for (int i = 0; i < 5; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            persons[i] = new Person(name, height, weight);
        }
        br.close();


        // TODO 1. 이름 순으로 정렬
        Arrays.sort(persons, (Person p, Person other) -> p.name.compareTo(other.name));

        bw.write("name\n");
        for (Person p: persons){
            bw.write(p.name + " " + p.height + " " + p.weight + "\n");
        }


        // TODO 2. 키 순으로 정렬
        Arrays.sort(persons, (Person p, Person other) -> other.height - p.height);

        bw.write("\nheight\n");
        for (Person p: persons){
            bw.write(p.name + " " + p.height + " " + p.weight + "\n");
        }

        bw.flush();
        bw.close();
    }
}


class Person {
    final String name;
    final int height;
    final double weight;

    public Person(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}