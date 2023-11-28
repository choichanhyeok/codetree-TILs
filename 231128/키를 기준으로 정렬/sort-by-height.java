import java.util.Scanner;
import java.util.Arrays;


/**
* TODO 2. Person 클래스는 Comparable 인터페이스를 상속 받아, compareTo를 오버라이드 해야함
*/
class Person implements Comparable<Person>{
    String name;
    int height, weight;

    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person){
        return this.height - person.height;
    }
}



public class Main {
    static final int MAXVALUE = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO 0. 입력: {입력 개수 n, n명의 이름-키-몸무게 정보}
        int n = sc.nextInt();
        Person[] persons = new Person[MAXVALUE];

        // TODO 1. Person 객체 배열에 n 명의 개인정보 저장
        for (int i = 0; i < n; i ++){
            persons[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        // TODO 3. compareTo를 오버라이드한 Person 객체를 Arrays.sort로 정렬
        Arrays.sort(persons, 0, n);

        // TODO 4. 오름차순 정렬된 Person형 객체 출력, (toString 오버라이드)
        for (int i = 0; i < n; i ++){
            System.out.print(persons[i].name + " ");
            System.out.print(persons[i].height + " ");
            System.out.println(persons[i].weight);
        }
    }
}