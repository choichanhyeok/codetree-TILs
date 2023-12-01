import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            persons[i] = new Person(name, height, weight);    
        }
        br.close();
        Arrays.sort(persons);

        for (Person p: persons){
            bw.write(p.name + " " +  p.height + " " + p.weight + "\n");
        }

        bw.flush();
        bw.close();
    }
}


class Person implements Comparable<Person>{
    final String name;
    final int height;
    final int weight;

    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person other){
        if (this.height != other.height)
            return this.height - other.height;
        
        return other.weight - this.weight;
    }
}