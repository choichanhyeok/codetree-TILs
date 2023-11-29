import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class Student{
    String name;
    int height; 
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO1. 사용자 정보 입력 (이름, 키, 몸무게(double))
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i ++){
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        // TODO2. COMPARATOR 이용해 바로 정렬
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b){
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for (int i = 0; i < 5; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.printf("%.1f\n", students[i].weight);
        }
        System.out.printf("\n");

        Arrays.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                return b.height - a.height;
            }
        });

        System.out.println("height");
        for (int i = 0; i < 5; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");        
            System.out.printf("%.1f\n", students[i].weight);    
        }
    }
}