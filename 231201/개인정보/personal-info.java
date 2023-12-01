import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        Person[] persons = new Person[5];
        for (int i = 0; i < 5; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
    
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            persons[i] = new Person(name, height, weight);
        }
        br.close();
        // TODO 1. 커스텀한 Comparable<Person> 익명 클래스 생성, 혹은 람다로 처리
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p, Person other){
                return p.name.compareTo(other.name);
            }
        });


        bw.write("name\n");

        for (Person p: persons){
            bw.write(p.name + " " + p.height + " " + p.weight + "\n");
        }

        Arrays.sort(persons, new Comparator<Person>() {
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
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}







// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.Comparator;

// // 학생들의 정보를 나타내는 클래스 선언
// class Student {
//     String name;
//     int height;
//     double weight;

//     public Student(String name, int height, double weight){
//         this.name = name;
//         this.height = height;
//         this.weight = weight;
//     }
// };

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 변수 선언 및 입력:
//         int n = 5;
//         Student[] students = new Student[n];
//         for(int i = 0; i < n; i++) {
//             String name = sc.next();
//             int height = sc.nextInt();
//             double weight = sc.nextDouble();

//             // Student 객체를 생성해 리스트에 추가합니다.
//             students[i] = new Student(name, height, weight);
//         }

//         // custom comparator를 활용한 정렬
//         Arrays.sort(students, new Comparator<Student>() {  
//             @Override
//             public int compare(Student a, Student b) { // 이름 기준 오름차순 정렬합니다.
//                 return a.name.compareTo(b.name);
//             }
//         });

//         // 이름순으로 정렬한 결과를 출력합니다.
//         System.out.println("name");
//         for (int i = 0; i < n; i++){
//             System.out.print(students[i].name + " ");
//             System.out.print(students[i].height + " ");
//             System.out.printf("%.1f\n", students[i].weight);
//         }

//         System.out.println();

//          // custom comparator를 활용한 정렬
//         Arrays.sort(students, new Comparator<Student>() {  
//             @Override
//             public int compare(Student a, Student b) { // 키 기준 내림차순 정렬합니다.
//                 return b.height - a.height;
//             }
//         });

//         // 키순으로 정렬한 결과를 출력합니다.
//         System.out.println("height");
//         for (int i = 0; i < n; i++){
//             System.out.print(students[i].name + " ");
//             System.out.print(students[i].height + " ");
//             System.out.printf("%.1f\n", students[i].weight);
//         }
//     }
// }