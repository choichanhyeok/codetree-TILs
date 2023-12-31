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

        Person[] persons = new Person[5];
        for (int i = 0; i < 5; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            persons[i] = new Person(name, height, weight);
        }

        br.close();

        Arrays.sort(persons, new Comparator<Person>(){
            @Override
            public int compare(Person p, Person other){
                return p.name.compareTo(other.name);
            }
        });

        bw.write("name\n");
        for (Person p: persons){
            bw.write(p.name + " " + p.height + " " + p.weight + "\n");
        }


        Arrays.sort(persons, new Comparator<Person>(){
            @Override
            public int compare(Person p, Person other){
                return other.height - p.height;
            }
        });

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